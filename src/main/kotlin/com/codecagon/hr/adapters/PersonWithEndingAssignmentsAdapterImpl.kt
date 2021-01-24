package com.codecagon.hr.adapters

import com.codecagon.hr.adapters.interfaces.PersonWithEndingAssignmentsAdapter
import com.codecagon.hr.dto.dashbord.PersonWithEndingAssignment
import com.codecagon.hr.dto.dashbord.mappers.PersonWithEndingAssignmentMapper
import com.codecagon.hr.services.interfaces.PersonWithEndingAssignmentService
import com.codecagon.hr.services.interfaces.ProjectService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PersonWithEndingAssignmentsAdapterImpl(
    @Autowired val personWithEndingAssignmentService: PersonWithEndingAssignmentService,
    @Autowired val personWithEndingAssignmentMapper: PersonWithEndingAssignmentMapper,
    @Autowired val projectService: ProjectService

) : PersonWithEndingAssignmentsAdapter {
    override fun getPersonsWithEndingAssignments(): List<PersonWithEndingAssignment> {

        val personsWithEndingAssignments = personWithEndingAssignmentService.getPersonsWithEndingAssignments()
        val projects = personsWithEndingAssignments
            .flatMap { (_, endingAssignment, nextAssignment) ->
                listOfNotNull(
                    endingAssignment.projectId,
                    nextAssignment?.projectId
                )
            }
            .let { projectService.findAllByIdIn(it) }

        return personsWithEndingAssignments
            .map { (person, endingAssignment, nextAssignment) ->
                personWithEndingAssignmentMapper.fromModel(
                    person,
                    endingAssignment, nextAssignment,
                    projects.find { it.id == endingAssignment.projectId }!!,
                    nextAssignment?.let { projects.find { it.id == nextAssignment.projectId } }
                )
            }
    }
}
