package com.codecagon.hr.controllers

import com.codecagon.hr.dto.ProjectAssignment
import com.codecagon.hr.dto.ProjectAssignmentRaw
import com.codecagon.hr.dto.mappers.ProjectAssignmentMapper
import com.codecagon.hr.services.interfaces.ProjectAssignmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/persons/{id}/project-assignments")
class ProjectAssignmentController(@Autowired val projectAssignmentService: ProjectAssignmentService,
                                  @Autowired var projectAssignmentMapper: ProjectAssignmentMapper) {

    @GetMapping
    fun getAllByPerson(@PathVariable id: UUID): List<ProjectAssignment> = projectAssignmentService.getAllByPerson(id)
            .let(projectAssignmentMapper::toResponse)

    @PostMapping
    fun addAssignment(@PathVariable id: UUID, @RequestBody assignment: ProjectAssignmentRaw) = assignment
            .let(projectAssignmentMapper::fromRequest)
            .let { projectAssignmentService.addAssignment(id, it) }
            .let(projectAssignmentMapper::toResponse)

    @PutMapping("/{assignmentId}")
    fun editAssignment(@PathVariable id: UUID, @PathVariable assignmentId: UUID, @RequestBody assignment: ProjectAssignmentRaw) = assignment
            .let { projectAssignmentMapper.fromRequest(it, assignmentId) }
            .let { projectAssignmentService.editAssignment(id, it) }
            .let(projectAssignmentMapper::toResponse)

    @DeleteMapping
    fun deleteAssignment(@PathVariable id: UUID, assignmentId: UUID) = projectAssignmentService.deleteAssignment(id, assignmentId)

}
