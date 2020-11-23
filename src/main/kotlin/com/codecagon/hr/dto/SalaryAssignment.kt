package com.codecagon.hr.dto

import com.codecagon.hr.entities.Assignment
import java.time.ZonedDateTime

class SalaryAssignment(
        start: ZonedDateTime,
        end: ZonedDateTime,
        paymentType: PaymentType) : Assignment(start, end) {
}
