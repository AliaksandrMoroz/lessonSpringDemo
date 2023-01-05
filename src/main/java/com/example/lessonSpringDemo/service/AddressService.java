package com.example.lessonSpringDemo.service;

import com.example.lessonSpringDemo.entity.Address;
import com.example.lessonSpringDemo.entity.Person;
import com.example.lessonSpringDemo.repository.AddressRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AddressService implements IAddressService {

    private final AddressRepo addressRepo;


    @Override
    public List<Person> getByCity(String city) {
        List<Address> addressList  = addressRepo.findByCity(city);

        List<Person> collect = addressList.stream().map(el -> el.getPerson()).distinct().collect(Collectors.toList());
        return collect;
    }
}
