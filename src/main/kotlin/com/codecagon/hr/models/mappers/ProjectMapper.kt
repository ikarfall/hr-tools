package com.codecagon.hr.models.mappers


import com.codecagon.hr.models.Project
import org.mapstruct.Mapper
import com.codecagon.hr.entities.Project as ProjectEntity

@Mapper(componentModel = "spring", implementationName = "ProjectDaoMapper")
interface ProjectMapper {
    fun toModel(project: ProjectEntity): Project
    fun fromModel(project: Project): ProjectEntity

    fun toModel(projects: List<ProjectEntity>): List<Project>
    fun fromModel(projects: List<Project>): List<ProjectEntity>
}
