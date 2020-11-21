package com.codecagon.hr.dto

import com.codecagon.hr.entities.Assignment
import java.time.ZonedDateTime

class ProjectAssignmentResponse(
        start: ZonedDateTime,
        end: ZonedDateTime,
        projectRequest: ProjectResponse,
        type: AssignmentType) : Assignment(start, end) {
}

