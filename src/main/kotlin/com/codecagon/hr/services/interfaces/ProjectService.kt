package com.codecagon.hr.services.interfaces

import com.codecagon.hr.models.Project
import java.util.*


interface ProjectService {
    fun getAll(): List<Project>
    fun getById(id: UUID): Optional<Project>
    fun insert(project: Project): Project
    fun update(project: Project): Project
    fun deleteById(id: UUID)
}
