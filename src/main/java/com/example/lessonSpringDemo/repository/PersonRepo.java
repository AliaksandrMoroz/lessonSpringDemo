package com.example.lessonSpringDemo.repository;

import com.example.lessonSpringDemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer> {
    List<Person> findByName(String name);
}
