package com.codecagon.hr.managers.interfaces

import com.codecagon.hr.models.Project
import java.util.*

interface ProjectManager {
    fun getAll(): List<Project>
    fun getById(id: UUID): Project?
    fun insert(project: Project): Project
    fun update(project: Project): Project
    fun deleteById(id: UUID)
    fun getByExternalId(externalId: String): Project?
    fun findAllByIdIn(ids: List<UUID>): List<Project>
}
