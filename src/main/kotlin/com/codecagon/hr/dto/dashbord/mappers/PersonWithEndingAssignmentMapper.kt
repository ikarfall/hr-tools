package com.codecagon.hr.dto.dashbord.mappers

import com.codecagon.hr.dto.dashbord.PersonWithEndingAssignment
import com.codecagon.hr.models.Person
import com.codecagon.hr.models.Project
import com.codecagon.hr.models.ProjectAssignment
import org.mapstruct.*


@Mapper(componentModel = "spring", implementationName = "PersonWithEndingAssignmentDaoMapper")
abstract class PersonWithEndingAssignmentMapper {
    @Mappings(
        Mapping(source = "person.id", target = "id"),
        Mapping(source = "endingAssignment", target = "endingAssignment"),
        Mapping(source = "nextAssignment", target = "nextAssignment"),
        Mapping(ignore = true, target = "endingAssignment.projectName"),
        Mapping(ignore = true, target = "nextAssignment.projectName")
    )
    abstract fun fromModel(
        person: Person,
        endingAssignment: ProjectAssignment,
        nextAssignment: ProjectAssignment?,
        projectOfEndingAssignment: Project,
        projectOfNextAssignment: Project?
    ): PersonWithEndingAssignment

    // add this after mapping as
    //        Mapping(source = "projectOfEndingAssignment.name", target = "endingAssignment.projectName"),
    //        Mapping(source = "projectOfNextAssignment.name", target = "nextAssignment.projectName")
    // in mapping method does not work for some reason
    @AfterMapping
    fun addProjectNames(
        projectOfEndingAssignment: Project,
        projectOfNextAssignment: Project?,
        @MappingTarget result: PersonWithEndingAssignment
    ) {
        projectOfNextAssignment?.let { result.nextAssignment.projectName = projectOfNextAssignment.name }
        result.endingAssignment.projectName = projectOfEndingAssignment.name
    }

}
