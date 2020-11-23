package com.codecagon.hr.dto

import java.time.ZonedDateTime

class SalaryAssignmentRequest(
        start: ZonedDateTime,
        end: ZonedDateTime,
        paymentType: PaymentType) : Assignment(start, end)

