package com.codecagon.hr.dto.mappers

import com.codecagon.hr.dto.PersonRaw
import com.codecagon.hr.models.Person
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface PersonMapper {
    fun toResponse(person: Person): com.codecagon.hr.dto.Person
    fun fromRequest(person: PersonRaw): Person

    fun toResponse(persons: List<Person>): List<com.codecagon.hr.dto.Person>
    fun fromRequest(persons: List<PersonRaw>): List<Person>
}
