package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.entities.CorporateCustomer;
import com.tobeto.rent.a.car.repositories.CorporateCustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/corporate-customers")
public class CorporateCustomersController {

    private final CorporateCustomerRepository corporateCustomerRepository;

    public CorporateCustomersController (CorporateCustomerRepository corporateCustomerRepository){
        this.corporateCustomerRepository = corporateCustomerRepository;
    }

    @GetMapping
    public List <CorporateCustomer> getAll(){
        return corporateCustomerRepository.findAll();
    }

    @PostMapping
    public void addCorporateCustomer (@RequestBody CorporateCustomer corporateCustomer){
        corporateCustomerRepository.save(corporateCustomer);
    }

    @DeleteMapping("{id}")
    public void deleteCorporateCustomer (@PathVariable int id){
        CorporateCustomer corporateCustomerToDelete = corporateCustomerRepository.findById(id).orElseThrow();
        corporateCustomerRepository.delete(corporateCustomerToDelete);
    }

    @PutMapping
    public void updateCorporateCustomer (@PathVariable int id, @RequestBody CorporateCustomer corporateCustomer){
        CorporateCustomer corporateCustomerToupdate = corporateCustomerRepository.findById(id).orElseThrow();
        corporateCustomerToupdate.setCompanyName(corporateCustomer.getCompanyName());
        corporateCustomerToupdate.setTaxNumber(corporateCustomer.getTaxNumber());
        corporateCustomerToupdate.setTaxOfficeName(corporateCustomer.getTaxOfficeName());
        corporateCustomerRepository.save(corporateCustomerToupdate);
    }
}
