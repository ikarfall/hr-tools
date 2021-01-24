package com.codecagon.hr.dto.dashbord

import java.util.*

data class PersonWithEndingAssignment(
    var id: UUID,
    var firstName: String,
    var lastname: String,
    var endingAssignment: ProjectAssignmentWithProjectName,
    var nextAssignment: ProjectAssignmentWithProjectName
)
