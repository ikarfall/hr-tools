package com.codecagon.hr.jsonimport.dto.mappers

import com.codecagon.hr.jsonimport.dto.SalaryAssignmentRaw
import com.codecagon.hr.models.SalaryAssignment
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", implementationName = "SalaryAssignmentImportMapper")
interface SalaryAssignmentMapper {
    fun fromDto(salaryAssignmentRaws: List<SalaryAssignmentRaw>): List<SalaryAssignment>
}
