package com.codecagon.hr.managers.interfaces

import com.codecagon.hr.models.ProjectAssignment
import java.util.*

interface ProjectAssignmentManager {
    fun getAllByPerson(personId: UUID): List<ProjectAssignment>
    fun getAllByProject(projectId: UUID): List<ProjectAssignment>
    fun addAssignment(assignment: ProjectAssignment): ProjectAssignment
    fun deleteAssignment(id: UUID)
    fun editAssignment(assignment: ProjectAssignment): ProjectAssignment
}
