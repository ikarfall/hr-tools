package com.codecagon.hr.jsonimport.constrollers

import com.codecagon.hr.jsonimport.dto.ExternalProject
import com.codecagon.hr.jsonimport.dto.mappers.ProjectMapper
import com.codecagon.hr.services.interfaces.ProjectService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/projects")
class ImportProjectController(
    @Autowired val projectService: ProjectService,
    @Autowired val projectMapper: ProjectMapper
) {

    @PostMapping("/import")
    fun import(@RequestBody projects: List<ExternalProject>): ImportReport = projectMapper.fromDto(projects)
        .also { (projects) -> projects.forEach(projectService::insert) }
        .let { (projects, errors) -> ImportReport(projects.count(), errors) }

}


