package com.codecagon.hr.entities

import java.time.ZonedDateTime

class ProjectAssignment(
        start: ZonedDateTime,
        end: ZonedDateTime,
        project: Project,
        type: AssignmentType) : Assignment(start, end) {
}

enum class AssignmentType {
    Actual, Planned

}
