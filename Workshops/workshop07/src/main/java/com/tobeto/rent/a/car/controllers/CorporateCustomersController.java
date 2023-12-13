package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.services.abstracts.CorporateCustomerService;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.requests.AddCorporateCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.requests.UpdateCorporateCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.responses.GetListCompanyNameOrderedResponse;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.responses.GetListCompanyNameResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/corporate-customers")
public class CorporateCustomersController {

    private final CorporateCustomerService corporateCustomerService;

    public CorporateCustomersController (CorporateCustomerService corporateCustomerService){
        this.corporateCustomerService = corporateCustomerService;
    }

    @PostMapping
    public void addCorporateCustomer (@RequestBody AddCorporateCustomerRequest addCorporateCustomerRequest){
        corporateCustomerService.addCorporateCustomer(addCorporateCustomerRequest);
    }

    @PutMapping
    public void updateCorporateCustomer (@RequestBody UpdateCorporateCustomerRequest updateCorporateCustomerRequest){
        corporateCustomerService.updateCorporateCustomer(updateCorporateCustomerRequest);
    }

    @DeleteMapping("{id}")
    public void deleteCorporateCustomer (@PathVariable int id){
        corporateCustomerService.deleteCorporateCustomer(id);
    }
/*
    @GetMapping ("tax-office-name")
    public List<GetListCompanyNameResponse> getByTaxOfficeName (@RequestParam String taxOfficeName){
        return corporateCustomerService.getByTaxOfficeName(taxOfficeName);
    }

    @GetMapping ("company-name-sorted")
    public List <GetListCompanyNameOrderedResponse> getByCompanyNameSorted (@RequestParam String companyName){
        return corporateCustomerService.getByCompanyNameSorted(companyName);
    }*/
}
