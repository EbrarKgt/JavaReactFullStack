package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.individualCustomer.requests.AddIndividualCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.requests.UpdateIndividualCustomerRequest;

public interface IndividualCustomerService {
    void addIndividualCustomer (AddIndividualCustomerRequest addIndividualCustomerRequest);
    void updateIndividualCustomer (UpdateIndividualCustomerRequest updateIndividualCustomerRequest);
    void deleteIndividualCustomer (int id);
}
