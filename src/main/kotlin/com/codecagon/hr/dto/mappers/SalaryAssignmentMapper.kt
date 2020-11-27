package com.codecagon.hr.dto.mappers

import com.codecagon.hr.dto.SalaryAssignmentRaw
import com.codecagon.hr.models.SalaryAssignment
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface SalaryAssignmentMapper {
    fun toResponse(salaryAssignment: SalaryAssignment): com.codecagon.hr.dto.SalaryAssignment
    fun fromRequest(salaryAssignment: SalaryAssignmentRaw): SalaryAssignment

    fun toResponse(salaryAssignments: List<SalaryAssignment>): List<com.codecagon.hr.dto.SalaryAssignment>
    fun fromRequest(salaryAssignments: List<SalaryAssignmentRaw>): List<SalaryAssignment>
}
