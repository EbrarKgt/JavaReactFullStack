package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.services.abstracts.CustomerService;
import com.tobeto.rent.a.car.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.customer.requests.UpdateCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.customer.responses.GetListPhoneResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    private final CustomerService customerService;

    public CustomersController (CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping
    public void addCustomer (@RequestBody AddCustomerRequest addCustomerRequest){
        customerService.addCustomer(addCustomerRequest);
    }

    @PutMapping
    public void updateCustomer (@RequestBody UpdateCustomerRequest updateCustomerRequest){
        customerService.updateCustomer(updateCustomerRequest);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer (@PathVariable int id){
        customerService.deleteCustomer(id);
    }
/*
    @GetMapping ("phones-with-special-char.")
    public List<GetListPhoneResponse> getBySpecialPhone (){
        return customerService.getBySpecialPhone();
    }*/
}
