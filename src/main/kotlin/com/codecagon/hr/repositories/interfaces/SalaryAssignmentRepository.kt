package com.codecagon.hr.repositories.interfaces

import com.codecagon.hr.entities.SalaryAssignment
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface SalaryAssignmentRepository : MongoRepository<SalaryAssignment, UUID> {
    fun findByPersonId(personId: UUID): List<SalaryAssignment>
    fun deleteAllByPersonId(personId: UUID)
}
