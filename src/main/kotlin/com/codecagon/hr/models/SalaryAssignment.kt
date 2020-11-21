package com.codecagon.hr.models

import java.time.ZonedDateTime
import java.util.*

class SalaryAssignment(
        id: UUID,
        start: ZonedDateTime,
        end: ZonedDateTime,
        paymentType: PaymentType) : Assignment(id, start, end) {
}

