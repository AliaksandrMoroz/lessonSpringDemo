package com.example.lessonSpringDemo.service;

import com.example.lessonSpringDemo.entity.Person;
import com.example.lessonSpringDemo.repository.PersonRepo;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Data
@Service
@RequiredArgsConstructor
public class PersonService implements IPersonService {

    private final PersonRepo personRepo;


    @Override
    @Transactional(readOnly = true)
    public List<Person> getAll() {
        return personRepo.findAll();
    }

    @Override
    public void addPerson(Person person) {
        personRepo.save(person);
    }

    @Override
    public Person getPersonByID(Integer id) {
        return personRepo.findById(id).get();
    }

    public List<Person> getPersonsByName(String name) {
        return personRepo.findByName(name);
    }

    @Transactional
    public Person updateEmailById(int id, String email) {
        Person byId = personRepo.findById(id).get();
        byId.setEmail(email);
        personRepo.save(byId);
        return byId;
    }
}
