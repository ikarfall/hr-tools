package com.codecagon.hr.controllers

import com.codecagon.hr.adapters.interfaces.PersonWithEndingAssignmentsAdapter
import com.codecagon.hr.dto.Person
import com.codecagon.hr.dto.PersonRaw
import com.codecagon.hr.dto.dashbord.PersonWithEndingAssignment
import com.codecagon.hr.dto.mappers.PersonMapper
import com.codecagon.hr.services.interfaces.PersonService
import com.codecagon.hr.then
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/persons")
class PersonController(
    @Autowired val personService: PersonService,
    @Autowired val personMapper: PersonMapper,
    @Autowired val personWithEndingAssignmentsAdapter: PersonWithEndingAssignmentsAdapter
) {

    @GetMapping
    fun getAll(): List<Person> = personService.getAll() then personMapper::toResponse

    @GetMapping("/{id}")
    fun getById(@PathVariable id: UUID): Person? =
        personService.getById(id)?.let(personMapper::toResponse)

    @PostMapping
    fun insert(@RequestBody person: PersonRaw): Person =
        personMapper.fromRequest(person) then personService::insert then personMapper::toResponse

    @PostMapping("/bulk")
    fun insertBulk(@RequestBody persons: List<PersonRaw>): List<Person> = persons
        .map(personMapper::fromRequest)
        .map(personService::insert)
        .map(personMapper::toResponse)


    @PutMapping
    fun update(@RequestBody personRaw: PersonRaw): Person =
        personMapper.fromRequest(personRaw) then personService::update then personMapper::toResponse

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: UUID) = personService.deleteById(id)


    @GetMapping("/with-ending-assignments")
    fun getPersonsWithEndingAssignment(): List<PersonWithEndingAssignment> {
        return personWithEndingAssignmentsAdapter.getPersonsWithEndingAssignments()
    }
}


