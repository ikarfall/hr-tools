package com.codecagon.hr.dto

import java.time.ZonedDateTime
import java.util.*

class SalaryAssignmentRequest(
        start: ZonedDateTime,
        end: ZonedDateTime,
        paymentType: PaymentType,
        personId: UUID,
        id: UUID) : Assignment(id, personId, start, end)

