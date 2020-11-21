package com.codecagon.hr.entities

class Person (
        firstName: String,
        lastname:String,
        projectAssignments: List<ProjectAssignment> = emptyList(),
        salaryAssignments: List<SalaryAssignment> = emptyList())
{
    // additional metadata, team, department, position
}
