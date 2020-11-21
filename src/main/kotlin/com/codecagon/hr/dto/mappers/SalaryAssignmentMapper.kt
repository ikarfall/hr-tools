package com.codecagon.hr.dto.mappers

import com.codecagon.hr.dto.SalaryAssignmentRequest
import com.codecagon.hr.dto.SalaryAssignmentResponse
import com.codecagon.hr.models.SalaryAssignment
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface SalaryAssignmentMapper {
    fun toResponse(salaryAssignment: SalaryAssignment) : SalaryAssignmentResponse
    fun fromRequest(salaryAssignment: SalaryAssignmentRequest) : SalaryAssignment

    fun toResponse(salaryAssignments: List<SalaryAssignment>) : List<SalaryAssignmentResponse>
    fun fromRequest(salaryAssignments: List<SalaryAssignmentRequest>) : List<SalaryAssignment>
}
