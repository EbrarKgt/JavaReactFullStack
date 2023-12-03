package com.tobeto.rent.a.car.services.dtos.individualCustomer.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCustomerNameAndAgeResponse {
    private String name;
    private String surname;
    private short age;
}
