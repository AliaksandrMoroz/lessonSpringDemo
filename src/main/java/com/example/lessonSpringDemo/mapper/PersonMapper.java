package com.example.lessonSpringDemo.mapper;

import com.example.lessonSpringDemo.dto.PersonEmailDTO;
import com.example.lessonSpringDemo.dto.PersonNameLastnameDTO;
import com.example.lessonSpringDemo.dto.PersonResponseDTO;
import com.example.lessonSpringDemo.entity.Person;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Data
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

    public PersonResponseDTO toPersonResponseDTO(Person person){
        return PersonResponseDTO.builder()
                .name(person.getName())
                .lastname(person.getLastname())
                .email(person.getEmail())
                .phoneNumber(person.getPhoneNumber())
                .addressList(person.getAddressList())
                .build();
    }
    public List<PersonResponseDTO> toPersonResponseDTOList(List<Person> persons){
        return persons.stream().map(this::toPersonResponseDTO).collect(Collectors.toList());
    }

}
