package com.codecagon.hr.models

import java.time.ZonedDateTime
import java.util.*

open class Assignment(id: UUID, personId: UUID, start: ZonedDateTime, end: ZonedDateTime)
