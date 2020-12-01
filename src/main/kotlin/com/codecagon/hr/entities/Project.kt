package com.codecagon.hr.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
class Project(
        @Id val id: UUID,
        val name: String,
        val description: String,
        val technologies: List<String>)
