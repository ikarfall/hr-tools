package com.codecagon.hr.dto

import java.time.ZonedDateTime

class ProjectAssignmentResponse(
        start: ZonedDateTime,
        end: ZonedDateTime,
        projectRequest: ProjectResponse,
        type: AssignmentType) : Assignment(start, end)

