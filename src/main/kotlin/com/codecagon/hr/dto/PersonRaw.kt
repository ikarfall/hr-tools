package com.codecagon.hr.dto

class PersonRaw(
        val firstName: String,
        val lastname: String,
        val projectAssignments: List<ProjectAssignmentRaw> = emptyList(),
        val salaryAssignments: List<SalaryAssignmentRaw> = emptyList())
