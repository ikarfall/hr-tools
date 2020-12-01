package com.codecagon.hr.entities

import com.codecagon.hr.models.Person
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.*

@Document
class Person(
        @Id val id: UUID,
        val firstName: String,
        val lastname: String,
        val labels: List<String> = emptyList(),
        var relations: List<Pair<Person, String>> = emptyList(),
        var dob: LocalDate,
        var employedDate: ZonedDateTime)
