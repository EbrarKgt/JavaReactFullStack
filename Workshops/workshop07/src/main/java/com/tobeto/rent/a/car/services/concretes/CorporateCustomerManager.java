package com.tobeto.rent.a.car.services.concretes;

import com.tobeto.rent.a.car.entities.CorporateCustomer;
import com.tobeto.rent.a.car.repositories.CorporateCustomerRepository;
import com.tobeto.rent.a.car.services.abstracts.CorporateCustomerService;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.requests.AddCorporateCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.requests.UpdateCorporateCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.responses.GetListCompanyNameOrderedResponse;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.responses.GetListCompanyNameResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorporateCustomerManager implements CorporateCustomerService {
    private final CorporateCustomerRepository corporateCustomerRepository;

    public CorporateCustomerManager (CorporateCustomerRepository corporateCustomerRepository){
        this.corporateCustomerRepository = corporateCustomerRepository;
    }


    @Override
    public void addCorporateCustomer(AddCorporateCustomerRequest addCorporateCustomerRequest) {
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCompanyName(addCorporateCustomerRequest.getCompanyName());
        corporateCustomer.setTaxNumber(addCorporateCustomerRequest.getTaxNumber());
        corporateCustomer.setTaxOfficeName(addCorporateCustomerRequest.getTaxOfficeName());
        corporateCustomerRepository.save(corporateCustomer);
    }

    @Override
    public void updateCorporateCustomer(UpdateCorporateCustomerRequest updateCorporateCustomerRequest) {
        CorporateCustomer corporateCustomerToUpdate = corporateCustomerRepository.findById(updateCorporateCustomerRequest.getId()).orElseThrow();
        corporateCustomerToUpdate.setCompanyName(updateCorporateCustomerRequest.getCompanyName());
        corporateCustomerToUpdate.setTaxNumber(updateCorporateCustomerRequest.getTaxNumber());
        corporateCustomerToUpdate.setTaxOfficeName(updateCorporateCustomerRequest.getTaxOfficeName());
        corporateCustomerRepository.save(corporateCustomerToUpdate);
    }

     @Override
     public void deleteCorporateCustomer (int id){
         CorporateCustomer corporateCustomerToDelete = corporateCustomerRepository.findById(id).orElseThrow();
         corporateCustomerRepository.delete(corporateCustomerToDelete);
     }

     /*
    @Override
    public List<GetListCompanyNameResponse> getByTaxOfficeName(String taxOfficeName) {
        return corporateCustomerRepository.findByName(taxOfficeName);
    }

    @Override
    public List<GetListCompanyNameOrderedResponse> getByCompanyNameSorted(String companyName) {
        return corporateCustomerRepository.findCompaniesAfterNameAlphabeticallySorted(companyName);
    }*/
}
