package com.tobeto.rent.a.car.services.dtos.corporateCustomer.requests;

import lombok.Data;

@Data
public class UpdateCorporateCustomerRequest {
    private int id;
    private String taxNumber;
    private String taxOfficeName;
    private String companyName;
}
