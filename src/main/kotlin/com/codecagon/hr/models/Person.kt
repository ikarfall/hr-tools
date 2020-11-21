package com.codecagon.hr.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
class Person (
        @Id val id: UUID,
        firstName: String,
        lastname:String,
        projectAssignments: List<ProjectAssignment> = emptyList(),
        salaryAssignments: List<SalaryAssignment> = emptyList())
{
    // additional metadata, team, department, position
}
