package com.codecagon.hr.dto

import java.time.ZonedDateTime
import java.util.*

class ProjectAssignmentRequest(
        val start: ZonedDateTime,
        val end: ZonedDateTime,
        val projectRequest: ProjectRequest,
        val type: AssignmentType,
        val personId: UUID,
        val id: UUID)

