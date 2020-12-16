package com.codecagon.hr.models

import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.*

class Person(
    var id: UUID,
    var firstName: String,
    var lastname: String,
    var dob: LocalDate,
    val tags: List<Tag> = emptyList(),
    var relations: List<PersonReference> = emptyList(),
    var employedDate: ZonedDateTime = ZonedDateTime.now(),
    var projectAssignments: List<ProjectAssignment> = emptyList(),
    var salaryAssignments: List<SalaryAssignment> = emptyList()
)
