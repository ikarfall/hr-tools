package com.codecagon.hr.jsonimport.dto.mappers

import com.codecagon.hr.jsonimport.dto.ExternalPerson
import com.codecagon.hr.jsonimport.dto.PersonReference
import com.codecagon.hr.models.Person
import org.mapstruct.Mapper
import org.springframework.beans.factory.annotation.Autowired
import java.util.*
import com.codecagon.hr.models.PersonReference as PersonReferenceModel

@Mapper(
    componentModel = "spring", implementationName = "PersonImportMapper",
    uses = [ProjectAssignmentMapper::class, SalaryAssignmentMapper::class, TagMapper::class]
)
abstract class PersonMapper {
    @Autowired
    lateinit var projectAssignmentMapper: ProjectAssignmentMapper
    @Autowired
    lateinit var salaryAssignmentMapper: SalaryAssignmentMapper
    @Autowired
    lateinit var tagMapper: TagMapper

    fun fromDto(persons: List<ExternalPerson>): Pair<List<Person>, List<String>> {
        val knownPersons = persons.map { it.externalId to UUID.randomUUID() }.toMap()
        val errors = mutableListOf<String>()
        return persons.mapNotNull {
            knownPersons[it.externalId]?.let { uuid ->
                Person(
                    uuid,
                    it.firstName,
                    it.lastName,
                    it.dob,
                    tagMapper.toModel(it.tags),
                    it.relations.mapNotNull { personRef ->
                        knownPersons[personRef.id]
                            ?.let { refUuid -> PersonReferenceModel(refUuid, personRef.label) }
                            ?: logRelationImportError(errors, personRef, uuid)
                    },
                    it.employedDate,
                    projectAssignmentMapper.fromDto(it.projectAssignments),
                    salaryAssignmentMapper.fromDto(it.salaryAssignments)
                )
            } ?: logPersonImportError(errors, it)
        } to errors
    }

    private fun logRelationImportError(
        errors: MutableList<String>,
        personRef: PersonReference,
        uuid: UUID?
    ): PersonReferenceModel? = run {
        errors.add("person ${personRef.id} is not found. relation for person $uuid is skipped")
        null
    }


    private fun logPersonImportError(errors: List<String>, person: ExternalPerson): Person? = run {
        errors + "person ${person.externalId} can not be imported"
        null
    }
}
