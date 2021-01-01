package com.codecagon.hr.jsonimport.dto

import java.time.ZonedDateTime

data class ExternalProjectAssignment(
        val start: ZonedDateTime,
        val end: ZonedDateTime,
        val projectId: String,
        val type: AssignmentType
)

