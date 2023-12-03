package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndPriceResponse;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.requests.AddCorporateCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.requests.UpdateCorporateCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.responses.GetListCompanyNameOrderedResponse;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.responses.GetListCompanyNameResponse;

import java.util.List;

public interface CorporateCustomerService {
    void addCorporateCustomer (AddCorporateCustomerRequest addCorporateCustomerRequest);
    void updateCorporateCustomer (UpdateCorporateCustomerRequest updateCorporateCustomerRequest);
    void deleteCorporateCustomer (int id);
    List<GetListCompanyNameResponse> getByTaxOfficeName (String taxOfficeName);
    List <GetListCompanyNameOrderedResponse> getByCompanyNameSorted (String companyName);
}
