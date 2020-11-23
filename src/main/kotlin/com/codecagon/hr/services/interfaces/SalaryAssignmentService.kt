package com.codecagon.hr.services.interfaces

import com.codecagon.hr.models.SalaryAssignment
import java.util.*

interface SalaryAssignmentService {
    fun getAllByPerson(personId: UUID): List<SalaryAssignment>
    fun addAssignment(personId: UUID, assignment: SalaryAssignment): SalaryAssignment
    fun deleteAssignment(personId: UUID, assignmentId: UUID)
    fun editAssignment(personId: UUID, assignment: SalaryAssignment): SalaryAssignment
}
