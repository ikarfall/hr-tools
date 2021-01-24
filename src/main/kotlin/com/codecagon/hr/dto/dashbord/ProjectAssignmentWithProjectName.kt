package com.codecagon.hr.dto.dashbord

import com.codecagon.hr.dto.AssignmentType
import java.time.ZonedDateTime
import java.util.*

data class ProjectAssignmentWithProjectName(
    var start: ZonedDateTime,
    var end: ZonedDateTime,
    var projectId: UUID,
    var projectName: String? = null,
    var type: AssignmentType,
    var personId: UUID,
    var id: UUID
)
