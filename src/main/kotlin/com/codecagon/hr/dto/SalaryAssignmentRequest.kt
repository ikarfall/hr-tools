package com.codecagon.hr.dto

import java.time.ZonedDateTime
import java.util.*

class SalaryAssignmentRequest(
        val start: ZonedDateTime,
        val end: ZonedDateTime,
        val paymentType: PaymentType,
        val personId: UUID)

