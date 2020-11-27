package com.codecagon.hr.dto.mappers

import com.codecagon.hr.models.ProjectAssignment
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ProjectAssignmentMapper {
    fun toResponse(projectAssignment: ProjectAssignment): com.codecagon.hr.dto.ProjectAssignment
    fun fromRequest(projectAssignment: com.codecagon.hr.dto.ProjectAssignmentRaw): ProjectAssignment

    fun toResponse(projectAssignments: List<ProjectAssignment>): List<com.codecagon.hr.dto.ProjectAssignment>
    fun fromRequest(projectAssignments: List<com.codecagon.hr.dto.ProjectAssignmentRaw>): List<ProjectAssignment>
}
