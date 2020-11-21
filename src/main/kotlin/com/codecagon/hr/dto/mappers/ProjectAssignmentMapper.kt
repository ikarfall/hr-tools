package com.codecagon.hr.dto.mappers

import com.codecagon.hr.dto.ProjectAssignmentRequest
import com.codecagon.hr.dto.ProjectAssignmentResponse
import com.codecagon.hr.models.ProjectAssignment
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ProjectAssignmentMapper {
    fun toResponse(projectAssignment: ProjectAssignment) : ProjectAssignmentResponse
    fun fromRequest(projectAssignment: ProjectAssignmentRequest) : ProjectAssignment

    fun toResponse(projectAssignments: List<ProjectAssignment>) : List<ProjectAssignmentResponse>
    fun fromRequest(projectAssignments: List<ProjectAssignmentRequest>) : List<ProjectAssignment>
}
