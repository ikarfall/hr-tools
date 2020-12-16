package com.codecagon.hr.jsonimport.constrollers

import com.codecagon.hr.jsonimport.dto.ExternalPerson
import com.codecagon.hr.jsonimport.dto.mappers.PersonMapper
import com.codecagon.hr.services.interfaces.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/persons")
class ImportPersonController(@Autowired val personService: PersonService, @Autowired val personMapper: PersonMapper) {

    @PostMapping("/import")
    fun import(@RequestBody persons: List<ExternalPerson>): ImportReport = persons
        .let(personMapper::fromDto)
        .also { (persons) -> persons.map { personService.insert(it) } }
        .let { (persons, errors) -> ImportReport(persons.count(), errors) }

}


