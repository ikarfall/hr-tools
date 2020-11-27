package com.codecagon.hr.dto

import java.time.ZonedDateTime
import java.util.*

class ProjectAssignmentResponse(
        val start: ZonedDateTime,
        val end: ZonedDateTime,
        val projectRequest: ProjectResponse,
        val type: AssignmentType,
        val personId: UUID,
        val id: UUID)

