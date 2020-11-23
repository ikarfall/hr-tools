package com.codecagon.hr.repositories.interfaces

import com.codecagon.hr.entities.Person
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*


interface PersonRepository : MongoRepository<Person, UUID>
