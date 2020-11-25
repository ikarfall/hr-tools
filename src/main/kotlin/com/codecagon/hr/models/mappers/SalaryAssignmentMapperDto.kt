package com.codecagon.hr.models.mappers

import com.codecagon.hr.models.SalaryAssignment
import org.mapstruct.Mapper
import com.codecagon.hr.entities.SalaryAssignment as SalaryAssignmentEntity

@Mapper(componentModel = "spring")
interface SalaryAssignmentMapperDto {
    fun toModel(projectAssignment: SalaryAssignmentEntity): SalaryAssignment
    fun fromModel(projectAssignment: SalaryAssignment): SalaryAssignmentEntity

    fun toModel(projectAssignment: List<SalaryAssignmentEntity>): List<SalaryAssignment>
    fun fromModel(projectAssignment: List<SalaryAssignment>): List<SalaryAssignmentEntity>
}
