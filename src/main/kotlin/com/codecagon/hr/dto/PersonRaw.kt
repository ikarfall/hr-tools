package com.codecagon.hr.dto

import java.time.LocalDate
import java.time.ZonedDateTime

class PersonRaw(
    val firstName: String,
    val lastname: String,
    var dob: LocalDate,
    val tags: List<Tag> = emptyList(),
    var relations: List<PersonReference> = emptyList(),
    var employedDate: ZonedDateTime,
    val projectAssignments: List<ProjectAssignmentRaw> = emptyList(),
    val salaryAssignments: List<SalaryAssignmentRaw> = emptyList()
)
