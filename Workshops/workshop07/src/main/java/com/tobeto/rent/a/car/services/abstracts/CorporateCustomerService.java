package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.corporateCustomer.requests.AddCorporateCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.requests.UpdateCorporateCustomerRequest;

public interface CorporateCustomerService {
    void addCorporateCustomer (AddCorporateCustomerRequest addCorporateCustomerRequest);
    void updateCorporateCustomer (UpdateCorporateCustomerRequest updateCorporateCustomerRequest);
    void deleteCorporateCustomer (int id);
}
