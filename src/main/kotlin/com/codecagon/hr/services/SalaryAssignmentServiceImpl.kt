package com.codecagon.hr.services

import com.codecagon.hr.managers.interfaces.SalaryAssignmentManager
import com.codecagon.hr.models.SalaryAssignment
import com.codecagon.hr.services.interfaces.SalaryAssignmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class SalaryAssignmentServiceImpl(@Autowired var assignmentManager: SalaryAssignmentManager) : SalaryAssignmentService {
    override fun getAllByPerson(personId: UUID): List<SalaryAssignment> = assignmentManager.getAllByPerson(personId)

    override fun addAssignment(personId: UUID, assignment: SalaryAssignment): SalaryAssignment = assignmentManager
            .addAssignment(assignment)

    override fun deleteAssignment(personId: UUID, assignmentId: UUID) = assignmentManager.deleteAssignment(assignmentId)

    override fun editAssignment(personId: UUID, assignment: SalaryAssignment): SalaryAssignment = assignmentManager
            .editAssignment(assignment)
}
