package com.codecagon.hr.jsonimport.dto.mappers

import com.codecagon.hr.jsonimport.dto.PaymentType
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface PaymentTypeMapper {
    fun fromDto(type: PaymentType): com.codecagon.hr.models.PaymentType
}
