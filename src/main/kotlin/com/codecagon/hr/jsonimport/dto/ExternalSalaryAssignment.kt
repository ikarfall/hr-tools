package com.codecagon.hr.jsonimport.dto

import java.time.ZonedDateTime

data class ExternalSalaryAssignment(
        val start: ZonedDateTime,
        val end: ZonedDateTime,
        val paymentType: PaymentType,
        val amount: Int
)

