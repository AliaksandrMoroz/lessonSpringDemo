package com.example.lessonSpringDemo.mapper;

import com.example.lessonSpringDemo.dto.AddressResponseDTO;
import com.example.lessonSpringDemo.entity.Address;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address toAddress(AddressResponseDTO addressResponseDTO);
    List<Address> toAddressList (List<AddressResponseDTO> addressResponseDTOList);
}
