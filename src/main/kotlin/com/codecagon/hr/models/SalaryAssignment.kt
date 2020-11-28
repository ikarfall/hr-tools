package com.codecagon.hr.models

import java.time.ZonedDateTime
import java.util.*

class SalaryAssignment(
        id: UUID,
        personId: UUID,
        start: ZonedDateTime,
        end: ZonedDateTime,
        val amount: Int,
        val paymentType: PaymentType) : Assignment(id, personId, start, end)

