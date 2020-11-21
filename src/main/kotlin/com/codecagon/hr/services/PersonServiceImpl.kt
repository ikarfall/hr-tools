package com.codecagon.hr.services

import com.codecagon.hr.models.Person
import com.codecagon.hr.services.interfaces.PersonService
import org.springframework.stereotype.Component
import java.util.*

@Component
class PersonServiceImpl : PersonService {
    override fun getAll(): List<Person> {
        TODO("Not yet implemented")
    }

    override fun getById(id: UUID): Optional<Person> {
        TODO("Not yet implemented")
    }

    override fun insert(person: Person): Person {
        TODO("Not yet implemented")
    }

    override fun update(person: Person): Person {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: UUID) {
        TODO("Not yet implemented")
    }
}
