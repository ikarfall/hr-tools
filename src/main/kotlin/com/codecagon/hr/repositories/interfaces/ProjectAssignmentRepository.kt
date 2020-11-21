package com.codecagon.hr.repositories.interfaces

import com.codecagon.hr.entities.ProjectAssignment
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface ProjectAssignmentRepository: MongoRepository<ProjectAssignment, UUID> {
}
