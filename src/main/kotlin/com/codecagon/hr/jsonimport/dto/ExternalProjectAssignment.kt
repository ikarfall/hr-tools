package com.codecagon.hr.jsonimport.dto

import java.time.ZonedDateTime
import java.util.*

class ExternalProjectAssignment(
        val start: ZonedDateTime,
        val end: ZonedDateTime,
        val projectId: String,
        val type: AssignmentType,
        val personId: UUID
)

