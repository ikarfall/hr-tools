package com.codecagon.hr.managers.interfaces

import com.codecagon.hr.models.ProjectAssignment
import java.util.*

interface ProjectAssignmentManager {
    fun getAllByPerson(personId:UUID): List<ProjectAssignment>
    fun addAssignment(personId: UUID, assignment: ProjectAssignment): ProjectAssignment
    fun deleteAssignment(personId: UUID, assignmentId: UUID)
    fun editAssignment(personId: UUID, assignment: ProjectAssignment)
}
