package com.codecagon.hr.jsonimport.dto.mappers

import com.codecagon.hr.models.AssignmentType
import org.mapstruct.Mapper
import com.codecagon.hr.jsonimport.dto.AssignmentType as AssignmentTypeRow

@Mapper(componentModel = "spring")
interface AssignmentTypeMapper {
    fun fromDto(type: AssignmentTypeRow): AssignmentType
}
