package com.codecagon.hr.controllers

import com.codecagon.hr.dto.SalaryAssignment
import com.codecagon.hr.dto.SalaryAssignmentRaw
import com.codecagon.hr.dto.mappers.SalaryAssignmentMapper
import com.codecagon.hr.services.interfaces.SalaryAssignmentService
import com.codecagon.hr.then
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/persons/{id}/salary-assignments")
class SalaryAssignmentController(@Autowired val salaryAssignmentService: SalaryAssignmentService,
                                 @Autowired var salaryAssignmentMapper: SalaryAssignmentMapper) {

    @GetMapping
    fun getAllByPerson(@PathVariable id: UUID): List<SalaryAssignment> = salaryAssignmentService.getAllByPerson(id) then (salaryAssignmentMapper::toResponse)

    @PostMapping
    fun addAssignment(@PathVariable id: UUID, assignment: SalaryAssignmentRaw) = assignment
            .let(salaryAssignmentMapper::fromRequest)
            .let { salaryAssignmentService.addAssignment(id, it) }
            .let(salaryAssignmentMapper::toResponse)

    @PutMapping
    fun editAssignment(@PathVariable id: UUID, assignment: SalaryAssignmentRaw) = assignment
            .let(salaryAssignmentMapper::fromRequest)
            .let { salaryAssignmentService.editAssignment(id, it) }
            .let(salaryAssignmentMapper::toResponse)

    @DeleteMapping
    fun deleteAssignment(@PathVariable id: UUID, assignmentId: UUID) = salaryAssignmentService.deleteAssignment(id, assignmentId)

}
