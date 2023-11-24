package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.rent.a.car.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.customer.requests.UpdateCustomerRequest;

public interface CustomerService {
    void addCustomer (AddCustomerRequest addCustomerRequest);
    void updateCustomer (UpdateCustomerRequest updateCustomerRequest);
    void deleteCustomer (int id);
}
