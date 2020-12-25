package com.codecagon.hr.dto.mappers

import com.codecagon.hr.dto.PersonRaw
import com.codecagon.hr.models.Person
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings
import com.codecagon.hr.dto.Person as PersonDto

@Mapper(componentModel = "spring")
interface PersonMapper {
    fun toResponse(person: Person): PersonDto


    @Mappings(
        Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())"),
        Mapping(target = "externalId", ignore = true)
    )
    fun fromRequest(person: PersonRaw): Person

    fun toResponse(persons: List<Person>): List<PersonDto>

    @Mappings(
        Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())"),
        Mapping(target = "externalId", ignore = true)
    )
    fun fromRequest(persons: List<PersonRaw>): List<Person>
}
