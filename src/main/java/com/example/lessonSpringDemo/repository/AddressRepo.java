package com.example.lessonSpringDemo.repository;

import com.example.lessonSpringDemo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {

    List<Address> findByCity (String city);
}
