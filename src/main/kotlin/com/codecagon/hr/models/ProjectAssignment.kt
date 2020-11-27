package com.codecagon.hr.models

import java.time.ZonedDateTime
import java.util.*

class ProjectAssignment(
        id: UUID,
        personId: UUID,
        start: ZonedDateTime,
        end: ZonedDateTime,
        val projectId: UUID,
        val type: AssignmentType) : Assignment(id, personId, start, end)

