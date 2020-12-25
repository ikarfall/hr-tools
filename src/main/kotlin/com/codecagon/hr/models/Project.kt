package com.codecagon.hr.models

import java.util.*

class Project(
    val id: UUID,
    var externalId: String?,
    val name: String,
    val description: String,
    val technologies: List<String>
)
