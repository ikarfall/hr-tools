package com.codecagon.hr.dto

import com.codecagon.hr.models.Person
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.*

class Person(
        val id: UUID,
        val firstName: String,
        val lastname: String,
        var dob: LocalDate,
        val labels: List<String> = emptyList(),
        var relations: List<Pair<Person, String>> = emptyList(),
        var employedDate: ZonedDateTime,
        val projectAssignments: List<ProjectAssignment> = emptyList(),
        val salaryAssignments: List<SalaryAssignment> = emptyList())
