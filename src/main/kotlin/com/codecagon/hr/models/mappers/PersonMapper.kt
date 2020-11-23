package com.codecagon.hr.models.mappers

import com.codecagon.hr.entities.ProjectAssignment
import com.codecagon.hr.entities.SalaryAssignment
import com.codecagon.hr.models.Person
import org.mapstruct.Mapper
import com.codecagon.hr.entities.Person as PersonEntity

@Mapper(componentModel = "spring")
interface PersonMapper {
    //TODO most likely does not work explicit implementation is needed
    fun toModel(person: PersonEntity,
                projectAssignments: List<ProjectAssignment>,
                salaryAssignments: List<SalaryAssignment>): Person

    fun fromModel(person: Person): PersonEntity

    fun fromModel(person: List<Person>): List<PersonEntity>
}
