package com.example.lessonSpringDemo.contoller;


import com.example.lessonSpringDemo.dto.PersonEmailDTO;
import com.example.lessonSpringDemo.dto.PersonNameLastnameDTO;
import com.example.lessonSpringDemo.entity.Person;
import com.example.lessonSpringDemo.mapper.PersonMapper;
import com.example.lessonSpringDemo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    private final PersonMapper personMapper;

    @GetMapping
    public ResponseEntity<List<Person>> getAllPersons(){
        return ResponseEntity.ok(personService.getAll());
    }

    @PostMapping
    public ResponseEntity<Person> addPerson(@RequestBody Person person){
        personService.addPerson(person);
        return ResponseEntity.ok(person);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<PersonNameLastnameDTO> getPersonNameAndLastNameById(@PathVariable Integer id){
        PersonNameLastnameDTO personNameLastnameDTO = personMapper.toPersonNameLastnameDTO(personService.getPersonByID(id));
        return ResponseEntity.ok(personNameLastnameDTO);
    }

    @GetMapping(path = "/name/{name}")
    public ResponseEntity<List<PersonEmailDTO>> getPersonsByName(@PathVariable String name){
        return ResponseEntity.ok(personMapper.toPersonEmailDTOList(personService.getPersonsByName(name)));
    }

    @PatchMapping(path = "/{id}")
    public ResponseEntity<Person> updatePersonById(@PathVariable int id, @RequestParam String email){
        return ResponseEntity.ok(personService.updateEmailById(id, email));
    }



}
