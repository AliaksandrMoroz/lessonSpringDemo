package com.example.lessonSpringDemo.service;

import com.example.lessonSpringDemo.dto.RequestEmailDTO;
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
    public Person addPerson(Person person) {
        personRepo.save(person);
        return person;
    }

    @Override
    public Person getPersonByID(Long id) {
        return personRepo.findById(id).orElseThrow(RuntimeException::new);
    }
    @Override
    public List<Person> getPersonsByName(String name) {
        return personRepo.findByName(name);
    }

    @Override
    @Transactional
    public void deletePersonById(Long id) {
        Person byId = personRepo.findById(id).orElseThrow(RuntimeException::new);
        personRepo.delete(byId);
    }

    @Transactional
    @Override
    public Person updateEmailById(Long id, RequestEmailDTO email) {
        Person byId = personRepo.findById(id).orElseThrow(RuntimeException::new);
        byId.setEmail(email.getEmail());
        personRepo.save(byId);
        return byId;
    }
}
