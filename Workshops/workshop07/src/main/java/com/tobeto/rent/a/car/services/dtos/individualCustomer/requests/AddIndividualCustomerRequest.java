package com.tobeto.rent.a.car.services.dtos.individualCustomer.requests;

import lombok.Data;

@Data

public class AddIndividualCustomerRequest {
    private String name;
    private String surname;
    private short age;
    private String identityNumber;
}
