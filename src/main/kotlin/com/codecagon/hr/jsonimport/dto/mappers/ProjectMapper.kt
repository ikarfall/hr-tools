package com.codecagon.hr.jsonimport.dto.mappers

import com.codecagon.hr.jsonimport.dto.ExternalProject
import com.codecagon.hr.models.Project
import org.mapstruct.Mapper
import java.util.*

@Mapper(componentModel = "spring", implementationName = "ProjectImportMapper")
abstract class ProjectMapper {
    fun fromDto(externalProjects: List<ExternalProject>): Pair<List<Project>, List<String>> =
        //add validation in case two projects has same external Id
        externalProjects.map { Project(UUID.randomUUID(), it.externalId, it.name, it.description, it.technologies) } to
                emptyList()
}
