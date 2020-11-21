package com.codecagon.hr.entities

import java.time.ZonedDateTime

class SalaryAssignment(
        start: ZonedDateTime,
        end: ZonedDateTime,
        paymentType: PaymentType) : Assignment(start, end) {
}

enum class PaymentType {
    Annually, Monthly, Hourly
}
