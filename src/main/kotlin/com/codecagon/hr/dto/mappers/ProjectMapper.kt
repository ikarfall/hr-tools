package com.codecagon.hr.dto.mappers

import com.codecagon.hr.dto.ProjectRaw
import com.codecagon.hr.models.Project
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import com.codecagon.hr.dto.Project as ProjectDto

@Mapper(componentModel = "spring")
interface ProjectMapper {
    fun toResponse(project: Project): ProjectDto

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    fun fromRequest(project: ProjectRaw): Project

    fun toResponse(projects: List<Project>): List<ProjectDto>

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    fun fromRequest(projects: List<ProjectRaw>): List<Project>

}
