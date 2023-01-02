package com.example.lessonSpringDemo.mapper;

import com.example.lessonSpringDemo.dto.PersonResponseDTO;
import com.example.lessonSpringDemo.entity.Person;

import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapperMapStruct {
    PersonResponseDTO toPersonResponseDTO(Person person);
    List<PersonResponseDTO> toPersonResponseDTOList(List<Person> personList);
}
