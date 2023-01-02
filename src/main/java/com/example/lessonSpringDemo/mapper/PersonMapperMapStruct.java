package com.example.lessonSpringDemo.mapper;

import com.example.lessonSpringDemo.dto.PersonResponseDTO;
import com.example.lessonSpringDemo.entity.Person;

import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapperMapStruct {
    @Mappings({
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "lastname", target = "lastname"),
            @Mapping(source = "email", target="email")
    })
    PersonResponseDTO toPersonResponseDTO(Person person);
    List<PersonResponseDTO> toPersonResponseDTOList(List<Person> personList);
}
