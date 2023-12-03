package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.individualCustomer.requests.AddIndividualCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.requests.UpdateIndividualCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.responses.GetListCustomerNameAndAgeResponse;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.responses.GetListNameSortedResponse;

import java.util.List;

public interface IndividualCustomerService {
    void addIndividualCustomer (AddIndividualCustomerRequest addIndividualCustomerRequest);
    void updateIndividualCustomer (UpdateIndividualCustomerRequest updateIndividualCustomerRequest);
    void deleteIndividualCustomer (int id);
    List<GetListCustomerNameAndAgeResponse> getByNameAndAge (int age);
    List<GetListNameSortedResponse> getByNameSorted();
}
