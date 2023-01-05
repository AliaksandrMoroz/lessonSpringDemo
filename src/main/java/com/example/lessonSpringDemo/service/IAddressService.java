package com.example.lessonSpringDemo.service;

import com.example.lessonSpringDemo.entity.Address;
import com.example.lessonSpringDemo.entity.Person;

import java.util.List;

public interface IAddressService {

    List<Person> getByCity(String city);
}
