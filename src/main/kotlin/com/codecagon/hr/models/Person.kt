package com.codecagon.hr.models

import java.util.*

class Person(
        var id: UUID,
        var firstName: String,
        var lastname: String,
        var projectAssignments: List<ProjectAssignment> = emptyList(),
        var salaryAssignments: List<SalaryAssignment> = emptyList())
