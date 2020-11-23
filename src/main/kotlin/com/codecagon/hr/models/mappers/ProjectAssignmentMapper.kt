package com.codecagon.hr.models.mappers

import com.codecagon.hr.models.ProjectAssignment
import org.mapstruct.Mapper
import com.codecagon.hr.entities.ProjectAssignment as ProjectAssignmentEntity

@Mapper(componentModel = "spring")
interface ProjectAssignmentMapper {
    fun toModel(projectAssignment: ProjectAssignmentEntity): ProjectAssignment
    fun fromModel(projectAssignment: ProjectAssignment): ProjectAssignmentEntity

    fun toModel(projectAssignment: List<ProjectAssignmentEntity>): List<ProjectAssignment>
    fun fromModel(projectAssignment: List<ProjectAssignment>): List<ProjectAssignmentEntity>

}
