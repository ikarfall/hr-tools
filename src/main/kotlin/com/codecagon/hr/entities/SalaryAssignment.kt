package com.codecagon.hr.entities

import java.time.ZonedDateTime
import java.util.*

class SalaryAssignment(
        id: UUID,
        start: ZonedDateTime,
        end: ZonedDateTime,
        val paymentType: PaymentType,
        personId: UUID) : Assignment(id, personId, start, end)

