package com.codecagon.hr.services

import com.codecagon.hr.models.SalaryAssignment
import com.codecagon.hr.services.interfaces.SalaryAssignmentService
import org.springframework.stereotype.Component
import java.util.*

@Component
class SalaryAssignmentServiceImpl : SalaryAssignmentService {
    override fun getAllByPerson(personId: UUID): List<SalaryAssignment> {
        TODO("Not yet implemented")
    }

    override fun addAssignment(personId: UUID, assignment: SalaryAssignment): SalaryAssignment {
        TODO("Not yet implemented")
    }

    override fun deleteAssignment(personId: UUID, assignmentId: UUID) {
        TODO("Not yet implemented")
    }

    override fun editAssignment(personId: UUID, assignment: SalaryAssignment) {
        TODO("Not yet implemented")
    }
}
