package com.codecagon.hr.dto

class PersonRequest (
        firstName: String,
        lastname:String,
        projectAssignments: List<ProjectAssignmentRequest> = emptyList(),
        salaryAssignments: List<SalaryAssignmentRequest> = emptyList())
{
    // additional metadata, team, department, position
}
