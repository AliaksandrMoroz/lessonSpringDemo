package com.example.lessonSpringDemo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonRequestDTO {

    private String name;

    private String lastname;

    private String email;

    private String phoneNumber;

    private List<AddressResponseDTO> addressList;
}
