package com.codecagon.hr.models.mappers

import com.codecagon.hr.entities.ProjectAssignment
import com.codecagon.hr.entities.SalaryAssignment
import com.codecagon.hr.models.Person
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings

import com.codecagon.hr.entities.Person as PersonEntity

@Mapper(componentModel = "spring", implementationName = "PersonDaoMapper")
interface PersonMapper {
    @Mappings(
            Mapping(source = "projectAssignments", target = "projectAssignments"),
            Mapping(source = "salaryAssignments", target = "salaryAssignments")
    )

    fun toModel(person: PersonEntity,
                projectAssignments: List<ProjectAssignment>,
                salaryAssignments: List<SalaryAssignment>): Person


    fun fromModel(person: Person): PersonEntity

    fun fromModel(person: List<Person>): List<PersonEntity>
}
