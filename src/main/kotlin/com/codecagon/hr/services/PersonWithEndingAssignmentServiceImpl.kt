package com.codecagon.hr.services

import com.codecagon.hr.managers.interfaces.PersonManager
import com.codecagon.hr.models.Person
import com.codecagon.hr.models.ProjectAssignment
import com.codecagon.hr.services.interfaces.PersonWithEndingAssignmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.time.ZonedDateTime
import java.util.*

const val monthsToLookForAssignmentEnds = 2L

@Component
class PersonWithEndingAssignmentServiceImpl(@Autowired var personManager: PersonManager) :
    PersonWithEndingAssignmentService {

    override fun getPersonsWithEndingAssignments(): List<Triple<Person, ProjectAssignment, ProjectAssignment?>> {
        val persons = personManager.getAll()
        return persons
            .flatMap { it.projectAssignments }
            .filter { assignmentIsActive(it) && assignmentEndsSoon(it) }
            .map {
                val person = findPersonById(persons, it.personId)
                Triple(person, it, findNextAssignment(person, it))
            }
    }

    private fun findPersonById(persons: List<Person>, id: UUID): Person {
        return persons.find { it.id == id } ?: throw IllegalStateException("Person with id $id not found")
    }

    private fun findNextAssignment(person: Person, endingAssignment: ProjectAssignment): ProjectAssignment? {
        return person.projectAssignments
            .filter { it.start.isAfter(endingAssignment.end) }
            .minByOrNull { it.start }
    }

    private fun assignmentIsActive(assignment: ProjectAssignment): Boolean {
        return assignment.start.isBefore(ZonedDateTime.now())
                && assignment.end.isAfter(ZonedDateTime.now())
    }

    private fun assignmentEndsSoon(assignment: ProjectAssignment): Boolean {
        return assignment.end.isBefore(ZonedDateTime.now().plusMonths(monthsToLookForAssignmentEnds))
    }
}
