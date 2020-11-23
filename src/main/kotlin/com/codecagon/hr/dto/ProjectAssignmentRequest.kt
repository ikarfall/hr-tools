package com.codecagon.hr.dto

import java.time.ZonedDateTime

class ProjectAssignmentRequest(
        start: ZonedDateTime,
        end: ZonedDateTime,
        projectRequest: ProjectRequest,
        type: AssignmentType) : Assignment(start, end)

