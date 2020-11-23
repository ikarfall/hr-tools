package com.codecagon.hr.models

import java.time.ZonedDateTime
import java.util.*

class ProjectAssignment(
        id: UUID,
        personId: UUID,
        var start: ZonedDateTime,
        var end: ZonedDateTime,
        var project: Project,
        var type: AssignmentType) : Assignment(id, personId, start, end)

