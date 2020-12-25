package com.codecagon.hr.services

import com.codecagon.hr.managers.interfaces.PersonManager
import com.codecagon.hr.models.Person
import com.codecagon.hr.services.interfaces.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class PersonServiceImpl(@Autowired var personManager: PersonManager) : PersonService {
    override fun getAll(): List<Person> = personManager.getAll()

    override fun getById(id: UUID): Person? = personManager.getById(id)

    override fun insert(person: Person): Person = personManager.insert(person)

    override fun update(person: Person): Person = personManager.updateWithoutAssignments(person)

    override fun deleteById(id: UUID) = personManager.deleteById(id)
}
