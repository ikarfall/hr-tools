package com.codecagon.hr.dto.mappers

import com.codecagon.hr.dto.ProjectAssignmentRaw
import com.codecagon.hr.models.ProjectAssignment
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import java.util.*
import com.codecagon.hr.dto.ProjectAssignment as ProjectAssignmentDto

@Mapper(componentModel = "spring")
interface ProjectAssignmentMapper {

    fun toResponse(projectAssignment: ProjectAssignment): ProjectAssignmentDto

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    fun fromRequest(projectAssignment: ProjectAssignmentRaw): ProjectAssignment

    fun toResponse(projectAssignments: List<ProjectAssignment>): List<ProjectAssignmentDto>

    fun fromRequest(projectAssignments: List<ProjectAssignmentRaw>): List<ProjectAssignment>

    @Mapping(source = "assignmentId", target = "id")
    fun fromRequest(projectAssignment: ProjectAssignmentRaw, assignmentId: UUID): ProjectAssignment
}
