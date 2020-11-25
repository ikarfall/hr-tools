package com.codecagon.hr.dto

import java.time.ZonedDateTime
import java.util.*

class ProjectAssignmentResponse(
        start: ZonedDateTime,
        end: ZonedDateTime,
        projectRequest: ProjectResponse,
        personId: UUID,
        id: UUID) : Assignment(id, personId, start, end)

