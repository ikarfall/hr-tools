package com.codecagon.hr.jsonimport.dto.mappers

import com.codecagon.hr.jsonimport.dto.ProjectAssignmentRaw
import com.codecagon.hr.models.ProjectAssignment
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", implementationName = "ProjectAssignmentImportMapper")
interface ProjectAssignmentMapper {
    fun fromDto(projectAssignmentRaws: List<ProjectAssignmentRaw>): List<ProjectAssignment>
}
