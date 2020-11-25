package com.codecagon.hr.managers

import com.codecagon.hr.managers.interfaces.PersonManager
import com.codecagon.hr.models.Person
import com.codecagon.hr.models.mappers.PersonMapper
import com.codecagon.hr.models.mappers.ProjectAssignmentMapper
import com.codecagon.hr.models.mappers.SalaryAssignmentMapper
import com.codecagon.hr.repositories.interfaces.PersonRepository
import com.codecagon.hr.repositories.interfaces.ProjectAssignmentRepository
import com.codecagon.hr.repositories.interfaces.SalaryAssignmentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class PersonManagerImpl(
        @Autowired var personRepository: PersonRepository,
        @Autowired var personMapper: PersonMapper,
        @Autowired var projectAssignmentRepository: ProjectAssignmentRepository,
        @Autowired var projectAssignmentMapper: ProjectAssignmentMapper,
        @Autowired var salaryAssignmentRepository: SalaryAssignmentRepository,
        @Autowired var salaryAssignmentMapper: SalaryAssignmentMapper
) : PersonManager {
    override fun getAll(): List<Person> = personRepository.findAll().map {
        val projectAssignments = projectAssignmentRepository.findByPersonId(it.id)
        val salaryAssignments = salaryAssignmentRepository.findByPersonId(it.id)
        personMapper.toModel(it, projectAssignments, salaryAssignments)
    }

    override fun getById(id: UUID): Optional<Person> = personRepository.findById(id).map {
        val projectAssignments = projectAssignmentRepository.findByPersonId(it.id)
        val salaryAssignments = salaryAssignmentRepository.findByPersonId(it.id)
        personMapper.toModel(it, projectAssignments, salaryAssignments)
    }

    override fun insert(person: Person): Person {
        val projectAssignments = person.projectAssignments
        val salaryAssignments = person.salaryAssignments
        return person
                .let(personMapper::fromModel)
                .let(personRepository::save)
                .let {
                    personMapper.toModel(it,
                            projectAssignments.map {
                                it
                                        .let(projectAssignmentMapper::fromModel)
                                        .let(projectAssignmentRepository::save)
                            },
                            salaryAssignments.map {
                                it
                                        .let(salaryAssignmentMapper::fromModel)
                                        .let(salaryAssignmentRepository::save)
                            })
                }
    }

    override fun updateWithoutAssignments(person: Person): Person {
        person
                .let(personMapper::fromModel)
                .let(personRepository::save)
        return this.getById(person.id).orElseThrow { IllegalArgumentException("Person with id ${person.id} in not ") }

    }


    override fun deleteById(id: UUID) {
        personRepository.deleteById(id)
        projectAssignmentRepository.deleteAllByPersonId(id)
        salaryAssignmentRepository.deleteAllByPersonId(id)
    }

}
