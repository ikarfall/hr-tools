package com.codecagon.hr.managers.interfaces

import com.codecagon.hr.models.SalaryAssignment
import java.util.*

interface SalaryAssignmentManager {
    fun getAllByPerson(personId: UUID): List<SalaryAssignment>
    fun addAssignment(personId: UUID, assignment: SalaryAssignment): SalaryAssignment
    fun deleteAssignment(personId: UUID, assignmentId: UUID)
    fun editAssignment(personId: UUID, assignment: SalaryAssignment)
}
