package com.codecagon.hr.jsonimport.dto

import java.time.LocalDate
import java.time.ZonedDateTime

class ExternalPerson(
        val externalId: String,
        val firstName: String,
        val lastName: String,
        var dob: LocalDate,
        val tags: List<Tag> = emptyList(),
        var relations: List<ExternalPersonReference> = emptyList(),
        var employedDate: ZonedDateTime,
        val projectAssignments: List<ExternalProjectAssignment> = emptyList(),
        val salaryAssignments: List<ExternalSalaryAssignment> = emptyList()
)
