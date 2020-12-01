package com.codecagon.hr.dto

import java.util.*

class Project(
        val id: UUID,
        val name: String,
        val description: String,
        val technologies: List<String>)
