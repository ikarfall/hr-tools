package com.codecagon.hr.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.*

@Document
class Person(
    @Id val id: UUID,
    val externalId: String?,
    val firstName: String,
    val lastname: String,
    val tags: List<Tag> = emptyList(),
    var relations: List<PersonReference> = emptyList(),
    var dob: LocalDate,
    var employedDate: ZonedDateTime
)
