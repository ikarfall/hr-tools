package com.codecagon.hr.services.interfaces

import com.codecagon.hr.models.Person
import java.util.*

interface PersonService {
    fun getAll(): List<Person>
    fun getById(id: UUID): Optional<Person>
    fun insert(person: Person): Person
    fun update(person: Person): Person
    fun deleteById(id: UUID)
}
