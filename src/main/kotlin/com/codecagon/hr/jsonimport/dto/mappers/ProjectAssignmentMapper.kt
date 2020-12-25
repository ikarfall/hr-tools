package com.codecagon.hr.jsonimport.dto.mappers

import com.codecagon.hr.jsonimport.dto.ExternalProjectAssignment
import com.codecagon.hr.models.ProjectAssignment
import com.codecagon.hr.services.interfaces.ProjectService
import org.mapstruct.Mapper
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

@Mapper(componentModel = "spring", implementationName = "ProjectAssignmentImportMapper")
abstract class ProjectAssignmentMapper {
    @Autowired
    lateinit var assignmentTypeMapper: AssignmentTypeMapper

    @Autowired
    lateinit var projectService: ProjectService

    fun fromDto(
        externalProjectAssignments: List<ExternalProjectAssignment>,
        personId: UUID
    ): Pair<List<ProjectAssignment>, List<String>> {
        val errors = mutableListOf<String>()
        return externalProjectAssignments.mapNotNull {
            projectService.getByExternalId(it.projectId)
                ?.let { project ->
                    ProjectAssignment(
                        UUID.randomUUID(), personId, it.start, it.end, project.id,
                        assignmentTypeMapper.fromDto(it.type)
                    )
                }
                ?: logProjectImportError(errors, it)
        } to errors
    }

    private fun logProjectImportError(
        errors: MutableList<String>,
        externalProject: ExternalProjectAssignment
    ): ProjectAssignment? = run {
        errors.add("No project found with external id ${externalProject.projectId}")
        null
    }
}
