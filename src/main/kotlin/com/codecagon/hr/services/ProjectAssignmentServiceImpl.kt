package com.codecagon.hr.services

import com.codecagon.hr.managers.interfaces.ProjectAssignmentManager
import com.codecagon.hr.models.ProjectAssignment
import com.codecagon.hr.services.interfaces.ProjectAssignmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class ProjectAssignmentServiceImpl(@Autowired var ssignmentManager: ProjectAssignmentManager) :
        ProjectAssignmentService {
    override fun getAllByPerson(personId: UUID): List<ProjectAssignment> = ssignmentManager.getAllByPerson(personId)

    override fun addAssignment(personId: UUID, assignment: ProjectAssignment): ProjectAssignment = ssignmentManager
            .addAssignment(assignment)

    override fun deleteAssignment(personId: UUID, assignmentId: UUID) = ssignmentManager.deleteAssignment(assignmentId)

    override fun editAssignment(personId: UUID, assignment: ProjectAssignment) = ssignmentManager
            .editAssignment(assignment)
}
