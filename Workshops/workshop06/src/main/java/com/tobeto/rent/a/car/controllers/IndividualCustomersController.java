package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.entities.IndividualCustomer;
import com.tobeto.rent.a.car.repositories.IndividualCustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/individual-customers")
public class IndividualCustomersController {

    private final IndividualCustomerRepository individualCustomerRepository;

    public IndividualCustomersController(IndividualCustomerRepository individualCustomerRepository){
        this.individualCustomerRepository = individualCustomerRepository;
    }

    @GetMapping
    public List <IndividualCustomer> getAll(){
        return individualCustomerRepository.findAll();
    }

    @PostMapping
    public void addIndividualCustomer (@RequestBody IndividualCustomer individualCustomer){
        individualCustomerRepository.save(individualCustomer);
    }

    @DeleteMapping("{id}")
    public void deleteIndividualCustomer (@PathVariable int id){
        IndividualCustomer individualCustomerToDelete = individualCustomerRepository.findById(id).orElseThrow();
        individualCustomerRepository.delete(individualCustomerToDelete);
    }

    @PutMapping
    public void updateIndividualCustomer (@PathVariable int id, @RequestBody IndividualCustomer individualCustomer){
        IndividualCustomer individualCustomerToUpdate = individualCustomerRepository.findById(id).orElseThrow();
        individualCustomerToUpdate.setName(individualCustomer.getName());
        individualCustomerToUpdate.setSurname(individualCustomer.getSurname());
        individualCustomerToUpdate.setAge(individualCustomer.getAge());
        individualCustomerToUpdate.setIdentityNumber(individualCustomer.getIdentityNumber());
        individualCustomerRepository.save(individualCustomerToUpdate);
    }
}
