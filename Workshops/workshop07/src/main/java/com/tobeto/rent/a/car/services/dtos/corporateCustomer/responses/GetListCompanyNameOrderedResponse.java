package com.tobeto.rent.a.car.services.dtos.corporateCustomer.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCompanyNameOrderedResponse {
    private int id;
    private String companyName;
}
