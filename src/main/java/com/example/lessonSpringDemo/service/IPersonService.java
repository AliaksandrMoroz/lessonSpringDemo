package com.example.lessonSpringDemo.service;

import com.example.lessonSpringDemo.entity.Person;

import java.util.List;

public interface IPersonService {

    List<Person> getAll();

    void addPerson(Person person);

    Person getPersonByID(Integer id);
}
