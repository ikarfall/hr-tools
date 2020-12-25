package com.codecagon.hr.managers

import com.codecagon.hr.managers.interfaces.ProjectManager
import com.codecagon.hr.models.Project
import com.codecagon.hr.models.mappers.ProjectMapper
import com.codecagon.hr.repositories.interfaces.ProjectRepository
import com.codecagon.hr.then
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class ProjectManagerImpl(@Autowired var repository: ProjectRepository,
                         @Autowired var mapper: ProjectMapper) : ProjectManager {
    override fun getAll(): List<Project> = repository.findAll() then mapper::toModel

    override fun getById(id: UUID): Project? = repository.findById(id).map(mapper::toModel).orElse(null)
    override fun getByExternalId(externalId: String): Project? =
        repository.getByExternalId(externalId)?.let(mapper::toModel)

    override fun insert(project: Project): Project = project
        .let(mapper::fromModel)
        .let(repository::save)
        .let(mapper::toModel)

    override fun update(project: Project): Project = project
        .let(mapper::fromModel)
        .let(repository::save)
        .let(mapper::toModel)

    override fun deleteById(id: UUID) = repository.deleteById(id)
}
