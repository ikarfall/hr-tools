package com.codecagon.hr.managers

import com.codecagon.hr.managers.interfaces.ProjectAssignmentManager
import com.codecagon.hr.models.ProjectAssignment
import com.codecagon.hr.models.mappers.ProjectAssignmentMapperDto
import com.codecagon.hr.repositories.interfaces.ProjectAssignmentRepository
import com.codecagon.hr.then
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

class ProjectAssignmentManagerImpl(@Autowired var projectAssignmentRepository: ProjectAssignmentRepository,
                                   @Autowired var mapper: ProjectAssignmentMapperDto) :
        ProjectAssignmentManager {
    override fun getAllByPerson(personId: UUID): List<ProjectAssignment> = projectAssignmentRepository.findByPersonId(personId) then mapper::toModel

    override fun getAllByProject(projectId: UUID): List<ProjectAssignment> = projectAssignmentRepository.findByProjectId(projectId) then mapper::toModel

    override fun addAssignment(assignment: ProjectAssignment): ProjectAssignment = assignment
            .let(mapper::fromModel)
            .let(projectAssignmentRepository::save)
            .let(mapper::toModel)

    override fun deleteAssignment(id: UUID) = projectAssignmentRepository.deleteById(id)


    override fun editAssignment(assignment: ProjectAssignment): ProjectAssignment = assignment
            .let(mapper::fromModel)
            .let(projectAssignmentRepository::save)
            .let(mapper::toModel)


}
