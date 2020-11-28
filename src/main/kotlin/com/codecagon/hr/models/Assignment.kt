package com.codecagon.hr.models

import java.time.ZonedDateTime
import java.util.*

open class Assignment(val id: UUID, val personId: UUID, val start: ZonedDateTime, val end: ZonedDateTime)
