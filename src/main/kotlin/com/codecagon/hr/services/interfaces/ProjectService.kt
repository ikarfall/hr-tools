package com.codecagon.hr.services.interfaces

import com.codecagon.hr.models.Project
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.util.*


interface ProjectService {
    fun getAll(pageable: Pageable): Page<Project>
    fun getById(id: UUID): Optional<Project>
    fun insert(project: Project): Project
    fun update(project: Project): Project
    fun deleteById(id: UUID)
}
