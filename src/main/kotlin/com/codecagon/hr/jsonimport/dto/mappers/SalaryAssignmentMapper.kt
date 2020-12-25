package com.codecagon.hr.jsonimport.dto.mappers

import com.codecagon.hr.jsonimport.dto.ExternalSalaryAssignment
import com.codecagon.hr.models.SalaryAssignment
import org.mapstruct.Mapper
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

@Mapper(componentModel = "spring", implementationName = "SalaryAssignmentImportMapper")
abstract class SalaryAssignmentMapper {
    @Autowired
    lateinit var paymentTypeMapper: PaymentTypeMapper

    fun fromDto(
        externalSalaryAssignments: List<ExternalSalaryAssignment>,
        personId: UUID
    ): Pair<List<SalaryAssignment>, List<String>> {

        return externalSalaryAssignments.map {
            SalaryAssignment(
                UUID.randomUUID(),
                personId,
                it.start,
                it.end,
                it.amount,
                paymentTypeMapper.fromDto(it.paymentType)
            )
        } to emptyList()
    }
}
