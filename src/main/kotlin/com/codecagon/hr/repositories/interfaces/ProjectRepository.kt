package com.codecagon.hr.repositories.interfaces

import com.codecagon.hr.entities.Project
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface ProjectRepository: MongoRepository<Project, UUID> {
    fun getByExternalId(externalId: String): Project?
}
