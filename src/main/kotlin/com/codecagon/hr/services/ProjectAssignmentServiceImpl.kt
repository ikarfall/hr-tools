package com.codecagon.hr.services

import com.codecagon.hr.models.ProjectAssignment
import com.codecagon.hr.services.interfaces.ProjectAssignmentService
import org.springframework.stereotype.Component
import java.util.*

@Component
class ProjectAssignmentServiceImpl : ProjectAssignmentService {
    override fun getAllByPerson(personId: UUID): List<ProjectAssignment> {
        TODO("Not yet implemented")
    }

    override fun addAssignment(personId: UUID, assignment: ProjectAssignment): ProjectAssignment {
        TODO("Not yet implemented")
    }

    override fun deleteAssignment(personId: UUID, assignmentId: UUID) {
        TODO("Not yet implemented")
    }

    override fun editAssignment(personId: UUID, assignment: ProjectAssignment) {
        TODO("Not yet implemented")
    }
}
