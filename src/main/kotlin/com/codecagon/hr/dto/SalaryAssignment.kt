package com.codecagon.hr.dto

import java.time.ZonedDateTime
import java.util.*

class SalaryAssignment(
        val start: ZonedDateTime,
        val end: ZonedDateTime,
        val paymentType: PaymentType,
        val personId: UUID,
        val id: UUID)

