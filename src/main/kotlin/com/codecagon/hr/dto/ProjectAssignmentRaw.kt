package com.codecagon.hr.dto

import java.time.ZonedDateTime
import java.util.*

class ProjectAssignmentRaw(
        val start: ZonedDateTime,
        val end: ZonedDateTime,
        val projectId: UUID,
        val type: AssignmentType,
        val personId: UUID)

