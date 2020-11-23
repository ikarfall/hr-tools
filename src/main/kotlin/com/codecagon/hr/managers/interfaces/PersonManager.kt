package com.codecagon.hr.managers.interfaces

import com.codecagon.hr.models.Person
import java.util.*

interface PersonManager {
    fun getAll(): List<Person>
    fun getById(id: UUID): Optional<Person>
    fun insert(person: Person): Person
    fun updateWithoutAssignments(person: Person): Person
    fun deleteById(id: UUID)
}
