package com.codecagon.hr.managers

import com.codecagon.hr.managers.interfaces.SalaryAssignmentManager
import com.codecagon.hr.models.SalaryAssignment
import com.codecagon.hr.models.mappers.SalaryAssignmentMapper
import com.codecagon.hr.repositories.interfaces.SalaryAssignmentRepository
import com.codecagon.hr.then
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

class SalaryAssignmentManagerImpl(
        @Autowired var salaryAssignmentRepository: SalaryAssignmentRepository,
        @Autowired var mapper: SalaryAssignmentMapper) : SalaryAssignmentManager {
    override fun getAllByPerson(personId: UUID): List<SalaryAssignment> = salaryAssignmentRepository.findByPersonId(personId) then mapper::toModel

    override fun addAssignment(assignment: SalaryAssignment): SalaryAssignment = assignment
            .let(mapper::fromModel)
            .let(salaryAssignmentRepository::save)
            .let(mapper::toModel)

    override fun deleteAssignment(id: UUID) = salaryAssignmentRepository.deleteById(id)


    override fun editAssignment(assignment: SalaryAssignment): SalaryAssignment = assignment
            .let(mapper::fromModel)
            .let(salaryAssignmentRepository::save)
            .let(mapper::toModel)


}
