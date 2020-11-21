package com.codecagon.hr.services

import com.codecagon.hr.models.Project
import com.codecagon.hr.services.interfaces.ProjectService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Component
import java.util.*

@Component
class ProjectServiceImpl : ProjectService {
    override fun getAll(pageable: Pageable): Page<Project> {
        TODO("Not yet implemented")
    }

    override fun getById(id: UUID): Optional<Project> {
        TODO("Not yet implemented")
    }

    override fun insert(project: Project): Project {
        TODO("Not yet implemented")
    }

    override fun update(project: Project): Project {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: UUID) {
        TODO("Not yet implemented")
    }
}
