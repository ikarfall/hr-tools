package com.codecagon.hr.controllers

import com.codecagon.hr.dto.ProjectRequest
import com.codecagon.hr.dto.ProjectResponse
import com.codecagon.hr.dto.mappers.ProjectMapper
import com.codecagon.hr.services.interfaces.ProjectService
import com.codecagon.hr.then
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/projects")
class ProjectController(@Autowired val projectService: ProjectService, @Autowired val projectMapper: ProjectMapper) {
    @GetMapping
    fun getAll(): List<ProjectResponse> = projectService.getAll() then (projectMapper::toResponse)

    @GetMapping("{id}")  fun getById(@PathVariable id: UUID): Optional<ProjectResponse> =
            projectService.getById(id).map(projectMapper::toResponse)

    @PostMapping
    fun insert(@RequestBody projectRequest: ProjectRequest): ProjectResponse
            = projectMapper.fromRequest(projectRequest) then projectService::insert then projectMapper::toResponse


    @PutMapping
    fun update(@RequestBody projectRequest: ProjectRequest): ProjectResponse
            = projectMapper.fromRequest(projectRequest) then projectService::update then projectMapper::toResponse

    @DeleteMapping("{id}")  fun deleteById(@PathVariable id: UUID) = projectService.deleteById(id)
}
