package com.codecagon.hr.dto

import java.util.*

class PersonResponse (
        id: UUID,
        firstName: String,
        lastname:String,
        projectAssignments: List<ProjectAssignmentResponse> = emptyList(),
        salaryAssignments: List<SalaryAssignmentResponse> = emptyList())
{
    // additional metadata, team, department, position
}
