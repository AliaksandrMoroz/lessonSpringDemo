package com.example.lessonSpringDemo.service;

import com.example.lessonSpringDemo.dto.RequestEmailDTO;
import com.example.lessonSpringDemo.entity.Person;

import java.util.List;

public interface IPersonService {

    List<Person> getAll();

    Person addPerson(Person person);

    Person getPersonByID(Long id);

    Person updateEmailById(Long id, RequestEmailDTO email);

    public List<Person> getPersonsByName(String name);

    void deletePersonById(Long id);
}
