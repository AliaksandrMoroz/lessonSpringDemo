package com.example.lessonSpringDemo.contoller;

import com.example.lessonSpringDemo.dto.PersonNameLastnameDTO;
import com.example.lessonSpringDemo.dto.PersonResponseDTO;
import com.example.lessonSpringDemo.mapper.PersonMapperMapStruct;
import com.example.lessonSpringDemo.service.IAddressService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "address")
@RequiredArgsConstructor
public class AddressController {

    private final PersonMapperMapStruct personMapperMapStruct;

    private final IAddressService addressService;

    @GetMapping(path = "{city}")
    @Operation(
            description = "Получение списка пользователей по городу"
    )
    public ResponseEntity<List<PersonNameLastnameDTO>> getPersonsByCity(@PathVariable String city){
        return ResponseEntity.ok(personMapperMapStruct.toPersonNameLastnameDTOList(addressService.getByCity(city)));
    }
}
