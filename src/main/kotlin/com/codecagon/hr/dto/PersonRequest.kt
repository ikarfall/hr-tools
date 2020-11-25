package com.codecagon.hr.dto

import java.util.*

class PersonRequest(
        id: UUID,
        firstName: String,
        lastname: String,
        projectAssignments: List<ProjectAssignmentRequest> = emptyList(),
        salaryAssignments: List<SalaryAssignmentRequest> = emptyList()) {
    // additional metadata, team, department, position
}
