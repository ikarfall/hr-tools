package com.codecagon.hr.models

import java.time.ZonedDateTime
import java.util.*

class ProjectAssignment(
        id: UUID,
        start: ZonedDateTime,
        end: ZonedDateTime,
        project: Project,
        type: AssignmentType) : Assignment(id ,start, end) {

}

