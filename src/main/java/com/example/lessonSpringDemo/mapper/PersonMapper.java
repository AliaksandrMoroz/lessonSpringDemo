package com.example.lessonSpringDemo.mapper;

import com.example.lessonSpringDemo.dto.PersonEmailDTO;
import com.example.lessonSpringDemo.dto.PersonNameLastnameDTO;
import com.example.lessonSpringDemo.entity.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {


    public PersonNameLastnameDTO toPersonNameLastnameDTO(Person person){
        return PersonNameLastnameDTO.builder()
                .name(person.getName())
                .lastname(person.getLastname())
                .build();
    }

    public List<PersonNameLastnameDTO> toPersonNameLastnameDTOList(List<Person> persons){
        return persons.stream().map(this::toPersonNameLastnameDTO).collect(Collectors.toList());
    }

    public PersonEmailDTO toPersonEmailDTO(Person person){
        return PersonEmailDTO.builder()
                .email(person.getEmail())
                .build();
    }

    public List<PersonEmailDTO> toPersonEmailDTOList(List<Person> persons){
        return persons.stream().map(this::toPersonEmailDTO).collect(Collectors.toList());
    }

}
