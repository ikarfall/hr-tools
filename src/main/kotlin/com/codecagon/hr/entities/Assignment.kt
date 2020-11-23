package com.codecagon.hr.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.ZonedDateTime
import java.util.*

@Document
open class Assignment(@Id var id: UUID, personId: UUID, start: ZonedDateTime, end: ZonedDateTime)
