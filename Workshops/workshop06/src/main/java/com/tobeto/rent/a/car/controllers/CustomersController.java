package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.entities.Customer;
import com.tobeto.rent.a.car.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    private final CustomerRepository customerRepository;

    public CustomersController (CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List <Customer> getAll(){
        return customerRepository.findAll();
    }

    @PostMapping
    public void addCustomer (@RequestBody Customer customer){
        customerRepository.save(customer);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer (@PathVariable int id){
        Customer customerToDelete = customerRepository.findById(id).orElseThrow();
        customerRepository.delete(customerToDelete);
    }

    @PutMapping
    public void updateCustomer (@PathVariable int id, @RequestBody Customer customer){
        Customer customerToUpdate = customerRepository.findById(id).orElseThrow();
        customerToUpdate.setPhone(customer.getPhone());
        customerToUpdate.setCustomerNumber(customer.getCustomerNumber());
        customerRepository.save(customerToUpdate);
    }
}
