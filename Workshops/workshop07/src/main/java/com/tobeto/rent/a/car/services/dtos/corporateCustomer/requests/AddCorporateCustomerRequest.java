package com.tobeto.rent.a.car.services.dtos.corporateCustomer.requests;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AddCorporateCustomerRequest {
    private String taxNumber;
    private String taxOfficeName;
    private String companyName;
}
