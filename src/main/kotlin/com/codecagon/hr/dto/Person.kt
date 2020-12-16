package com.codecagon.hr.dto

import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.*

class Person(
        val id: UUID,
        val firstName: String,
        val lastname: String,
        var dob: LocalDate,
        val tags: List<Tag> = emptyList(),
        var relations: List<PersonReference> = emptyList(),
        var employedDate: ZonedDateTime,
        val projectAssignments: List<ProjectAssignment> = emptyList(),
        val salaryAssignments: List<SalaryAssignment> = emptyList()
)
