package com.codecagon.hr.dto.mappers

import com.codecagon.hr.dto.PersonRequest
import com.codecagon.hr.dto.PersonResponse
import com.codecagon.hr.models.Person
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface PersonMapper {
    fun toResponse(person: Person) : PersonResponse
    fun fromRequest(person: PersonRequest) : Person

    fun toResponse(persons: List<Person>) : List<PersonResponse>
    fun fromRequest(persons: List<PersonRequest>) : List<Person>
}
