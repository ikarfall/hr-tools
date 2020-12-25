package com.codecagon.hr.dto.mappers

import com.codecagon.hr.dto.SalaryAssignmentRaw
import com.codecagon.hr.models.SalaryAssignment
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import java.util.*
import com.codecagon.hr.dto.SalaryAssignment as SalaryAssignmentDto

@Mapper(componentModel = "spring")
interface SalaryAssignmentMapper {
    fun toResponse(salaryAssignment: SalaryAssignment): SalaryAssignmentDto

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    fun fromRequest(salaryAssignment: SalaryAssignmentRaw): SalaryAssignment

    fun toResponse(salaryAssignments: List<SalaryAssignment>): List<SalaryAssignmentDto>

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    fun fromRequest(salaryAssignments: List<SalaryAssignmentRaw>): List<SalaryAssignment>

    @Mapping(source = "assignmentId", target = "id")
    fun fromRequest(salaryAssignment: SalaryAssignmentRaw, assignmentId: UUID): SalaryAssignment

}
