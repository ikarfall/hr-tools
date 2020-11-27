package com.codecagon.hr.dto

import java.time.ZonedDateTime
import java.util.*

class ProjectAssignment(
        val start: ZonedDateTime,
        val end: ZonedDateTime,
        val projectId: UUID,
        val type: AssignmentType,
        val personId: UUID,
        val id: UUID)

