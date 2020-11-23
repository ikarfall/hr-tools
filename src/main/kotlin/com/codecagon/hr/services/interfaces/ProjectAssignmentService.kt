package com.codecagon.hr.services.interfaces

import com.codecagon.hr.models.ProjectAssignment
import java.util.*

interface ProjectAssignmentService {
    fun getAllByPerson(personId:UUID): List<ProjectAssignment>
    fun addAssignment(personId: UUID, assignment: ProjectAssignment): ProjectAssignment
    fun deleteAssignment(personId: UUID, assignmentId: UUID)
    fun editAssignment(personId: UUID, assignment: ProjectAssignment): ProjectAssignment
}
