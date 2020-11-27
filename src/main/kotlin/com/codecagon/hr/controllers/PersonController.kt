package com.codecagon.hr.controllers

import com.codecagon.hr.dto.PersonRequest
import com.codecagon.hr.dto.PersonResponse
import com.codecagon.hr.dto.mappers.PersonMapper
import com.codecagon.hr.services.interfaces.PersonService
import com.codecagon.hr.then
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/persons")
class PersonController(@Autowired val personService: PersonService, @Autowired val personMapper: PersonMapper) {
    @GetMapping
    fun getAll(): List<PersonResponse> = personService.getAll() then personMapper::toResponse

    @GetMapping("{id}")  fun getById(@PathVariable id:UUID): Optional<PersonResponse> =
            personService.getById(id).map(personMapper::toResponse)

    @PostMapping
    fun insert(@RequestBody personRequest: PersonRequest): PersonResponse
         = personMapper.fromRequest(personRequest) then personService::insert then personMapper::toResponse

    @PutMapping
    fun update(@RequestBody personRequest: PersonRequest): PersonResponse
            = personMapper.fromRequest(personRequest) then personService::update then personMapper::toResponse

    @DeleteMapping("{id}")  fun deleteById(@PathVariable id: UUID) = personService.deleteById(id)
}


