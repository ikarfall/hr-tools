package com.codecagon.hr.dto.mappers

import com.codecagon.hr.dto.ProjectRaw
import com.codecagon.hr.models.Project
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ProjectMapper {
    fun toResponse(project: Project): com.codecagon.hr.dto.Project
    fun fromRequest(project: ProjectRaw): Project

    fun toResponse(projects: List<Project>): List<com.codecagon.hr.dto.Project>
    fun fromRequest(projects: List<ProjectRaw>): List<Project>

}
