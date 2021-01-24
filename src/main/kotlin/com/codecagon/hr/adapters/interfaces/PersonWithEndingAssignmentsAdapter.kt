package com.codecagon.hr.adapters.interfaces

import com.codecagon.hr.dto.dashbord.PersonWithEndingAssignment

interface PersonWithEndingAssignmentsAdapter {
    fun getPersonsWithEndingAssignments(): List<PersonWithEndingAssignment>
}
