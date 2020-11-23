package com.codecagon.hr.managers.interfaces

import com.codecagon.hr.models.SalaryAssignment
import java.util.*

interface SalaryAssignmentManager {
    fun getAllByPerson(personId: UUID): List<SalaryAssignment>
    fun addAssignment(assignment: SalaryAssignment): SalaryAssignment
    fun deleteAssignment(id: UUID)
    fun editAssignment(assignment: SalaryAssignment): SalaryAssignment
}
