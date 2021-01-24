package com.codecagon.hr.services

import com.codecagon.hr.managers.interfaces.ProjectManager
import com.codecagon.hr.models.Project
import com.codecagon.hr.services.interfaces.ProjectService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class ProjectServiceImpl(@Autowired var projectManager: ProjectManager) : ProjectService {
    override fun getAll(): List<Project> = projectManager.getAll()

    override fun getById(id: UUID): Project? = projectManager.getById(id)

    override fun getByExternalId(externalId: String): Project? = projectManager.getByExternalId(externalId)

    override fun findAllByIdIn(ids: List<UUID>): List<Project> = projectManager.findAllByIdIn(ids)

    override fun insert(project: Project): Project = projectManager.insert(project)

    override fun update(project: Project): Project = projectManager.update(project)

    override fun deleteById(id: UUID) = projectManager.deleteById(id)
}
