package com.codecagon.hr.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
class Person(
        @Id val id: UUID,
        val firstName: String,
        val lastname: String)
