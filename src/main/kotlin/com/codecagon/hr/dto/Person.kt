package com.codecagon.hr.dto

import java.util.*

class Person(
        val id: UUID,
        val firstName: String,
        val lastname: String,
        val projectAssignments: List<ProjectAssignment> = emptyList(),
        val salaryAssignments: List<SalaryAssignment> = emptyList())
