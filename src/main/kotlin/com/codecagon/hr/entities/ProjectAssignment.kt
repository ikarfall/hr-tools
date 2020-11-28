package com.codecagon.hr.entities

import java.time.ZonedDateTime
import java.util.*

class ProjectAssignment(
        id: UUID,
        start: ZonedDateTime,
        end: ZonedDateTime,
        val projectId: UUID,
        val type: AssignmentType,
        personId: UUID) : Assignment(id, personId, start, end)

