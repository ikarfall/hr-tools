package com.codecagon.hr.dto.mappers

import com.codecagon.hr.dto.ProjectRequest
import com.codecagon.hr.dto.ProjectResponse
import com.codecagon.hr.models.Project
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ProjectMapper {
    fun toResponse(project: Project) : ProjectResponse
    fun fromRequest(project: ProjectRequest) : Project

    fun toResponse(projects: List<Project>) : List<ProjectResponse>
    fun fromRequest(projects: List<ProjectRequest>) : List<Project>

}
