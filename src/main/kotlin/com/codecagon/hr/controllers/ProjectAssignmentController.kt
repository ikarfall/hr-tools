package com.codecagon.hr.controllers

import com.codecagon.hr.dto.ProjectAssignmentRequest
import com.codecagon.hr.dto.ProjectAssignmentResponse
import com.codecagon.hr.dto.mappers.ProjectAssignmentMapper
import com.codecagon.hr.services.interfaces.ProjectAssignmentService
import com.codecagon.hr.then
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("persons/{id}/project-assignments")
class ProjectAssignmentController(@Autowired val projectAssignmentService: ProjectAssignmentService,
                                  @Autowired var projectAssignmentMapper: ProjectAssignmentMapper) {

    @GetMapping
    fun getAllByPerson(@PathVariable id: UUID): List<ProjectAssignmentResponse> = projectAssignmentService.getAllByPerson(id) then (projectAssignmentMapper::toResponse)

    @PostMapping
    fun addAssignment(@PathVariable id: UUID, assignment: ProjectAssignmentRequest) = assignment
            .let(projectAssignmentMapper::fromRequest)
            .let { projectAssignmentService.addAssignment(id, it) }
            .let(projectAssignmentMapper::toResponse)

    @PutMapping
    fun editAssignment(@PathVariable id: UUID, assignment: ProjectAssignmentRequest) = assignment
            .let(projectAssignmentMapper::fromRequest)
            .let { projectAssignmentService.editAssignment(id, it) }
            .let(projectAssignmentMapper::toResponse)

    @DeleteMapping
    fun deleteAssignment(@PathVariable id: UUID, assignmentId: UUID) = projectAssignmentService.deleteAssignment(id, assignmentId)

}
