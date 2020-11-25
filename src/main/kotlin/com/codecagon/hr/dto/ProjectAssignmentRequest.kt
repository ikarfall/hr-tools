package com.codecagon.hr.dto

import java.time.ZonedDateTime
import java.util.*

class ProjectAssignmentRequest(
        start: ZonedDateTime,
        end: ZonedDateTime,
        projectRequest: ProjectRequest,
        type: AssignmentType,
        personId: UUID,
        id: UUID) : Assignment(id, personId, start, end)

