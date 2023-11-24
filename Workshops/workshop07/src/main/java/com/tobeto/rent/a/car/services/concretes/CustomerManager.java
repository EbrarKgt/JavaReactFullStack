package com.tobeto.rent.a.car.services.concretes;

import com.tobeto.rent.a.car.entities.Customer;
import com.tobeto.rent.a.car.repositories.CustomerRepository;
import com.tobeto.rent.a.car.services.abstracts.CustomerService;
import com.tobeto.rent.a.car.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.customer.requests.UpdateCustomerRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerManager implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerManager (CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public void addCustomer(AddCustomerRequest addCustomerRequest) {
        Customer customer = new Customer();
        customer.setPhone(addCustomerRequest.getPhone());
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(UpdateCustomerRequest updateCustomerRequest) {
        Customer customerToUpdate = customerRepository.findById(updateCustomerRequest.getId()).orElseThrow();
        customerToUpdate.setPhone(updateCustomerRequest.getPhone());
        customerRepository.save(customerToUpdate);
    }

    @Override
    public void deleteCustomer(int id) {
        Customer customerToDelete = customerRepository.findById(id).orElseThrow();
        customerRepository.delete(customerToDelete);
    }
}
