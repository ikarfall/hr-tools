package com.codecagon.hr.entities

import java.time.ZonedDateTime
import java.util.*

class ProjectAssignment(
        id: UUID,
        start: ZonedDateTime,
        end: ZonedDateTime,
        var projectId: UUID,
        var type: AssignmentType,
        var personId: UUID) : Assignment(id, personId, start, end)

