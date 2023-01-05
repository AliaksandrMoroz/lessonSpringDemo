package com.example.lessonSpringDemo.contoller;


import com.example.lessonSpringDemo.dto.PersonEmailDTO;
import com.example.lessonSpringDemo.dto.PersonRequestDTO;
import com.example.lessonSpringDemo.dto.PersonResponseDTO;
import com.example.lessonSpringDemo.dto.RequestEmailDTO;
import com.example.lessonSpringDemo.entity.Person;
import com.example.lessonSpringDemo.mapper.AddressMapper;
import com.example.lessonSpringDemo.mapper.PersonMapperMapStruct;
import com.example.lessonSpringDemo.service.IPersonService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "persons")
@RequiredArgsConstructor
public class PersonController {

    private final IPersonService personService;

    private final PersonMapperMapStruct personMapperMapStruct;

    private final AddressMapper addressMapper;

    @GetMapping
    @Operation(
            description = "Получение списка пользователей"
    )
    public ResponseEntity<List<PersonResponseDTO>> getAllPersons(){
        return ResponseEntity.ok(personMapperMapStruct.toPersonResponseDTOList(personService.getAll()));
    }

    @PostMapping
    public ResponseEntity<PersonResponseDTO> addPerson(@RequestBody PersonRequestDTO personDto){
        Person person1 = personMapperMapStruct.toPerson(personDto);
        person1.setAddressList(addressMapper.toAddressList(personDto.getAddressList()));
        Person person = personService.addPerson(person1);
        return ResponseEntity.ok(personMapperMapStruct.toPersonResponseDTO(person));
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<PersonResponseDTO> getPersonNameAndLastNameById(@PathVariable Long id){
        PersonResponseDTO personResponseDTO = personMapperMapStruct.toPersonResponseDTO(personService.getPersonByID(id));
        return ResponseEntity.ok(personResponseDTO);
    }

    @GetMapping(path = "name/{name}")
    public ResponseEntity<List<PersonEmailDTO>> getPersonsByName(@PathVariable String name){
        return ResponseEntity.ok(personMapperMapStruct.toPersonEmailDTOList(personService.getPersonsByName(name)));
    }

    @PatchMapping(path = "{id}")
    public ResponseEntity<PersonResponseDTO> updatePersonById(@PathVariable Long id, @RequestBody RequestEmailDTO email){
        return ResponseEntity.ok(personMapperMapStruct.toPersonResponseDTO(personService.updateEmailById(id, email)));
    }

    @DeleteMapping(path = "{id}")
    public String deleteById(@PathVariable Long id){
        personService.deletePersonById(id);
        return "Successfully";
    }



}
