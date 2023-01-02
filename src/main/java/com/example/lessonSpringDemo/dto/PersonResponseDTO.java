package com.example.lessonSpringDemo.dto;

import com.example.lessonSpringDemo.entity.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonResponseDTO {

    private int id;

    private String name;

    private String lastname;

    private String email;

    private String phoneNumber;

    private List<Address> addressList;
}
