package com.codecagon.hr.services.interfaces

import com.codecagon.hr.models.Person
import com.codecagon.hr.models.ProjectAssignment

interface PersonWithEndingAssignmentService {
    fun getPersonsWithEndingAssignments(): List<Triple<Person, ProjectAssignment, ProjectAssignment?>>
}
