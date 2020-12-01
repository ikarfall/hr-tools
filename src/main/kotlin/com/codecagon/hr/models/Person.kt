package com.codecagon.hr.models

import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.*

class Person(
        var id: UUID,
        var firstName: String,
        var lastname: String,
        var dob: LocalDate,
        val labels: List<String> = emptyList(),
        var relations: List<Pair<Person, String>> = emptyList(),
        var employedDate: ZonedDateTime = ZonedDateTime.now(),
        var projectAssignments: List<ProjectAssignment> = emptyList(),
        var salaryAssignments: List<SalaryAssignment> = emptyList())
