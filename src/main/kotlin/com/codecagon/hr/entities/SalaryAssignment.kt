package com.codecagon.hr.entities

import java.time.ZonedDateTime
import java.util.*

class SalaryAssignment(
        id: UUID,
        start: ZonedDateTime,
        end: ZonedDateTime,
        paymentType: PaymentType,
        var personId: UUID) : Assignment(id, personId, start, end)

