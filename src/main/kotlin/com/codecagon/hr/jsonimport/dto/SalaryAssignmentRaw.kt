package com.codecagon.hr.jsonimport.dto

import java.time.ZonedDateTime
import java.util.*

class SalaryAssignmentRaw(
        val start: ZonedDateTime,
        val end: ZonedDateTime,
        val paymentType: PaymentType,
        val amount: Int,
        val personId: UUID
)

