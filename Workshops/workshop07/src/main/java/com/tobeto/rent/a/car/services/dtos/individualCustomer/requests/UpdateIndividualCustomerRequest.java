package com.tobeto.rent.a.car.services.dtos.individualCustomer.requests;

import lombok.Data;

@Data
public class UpdateIndividualCustomerRequest {
    private int id;
    private String name;
    private String surname;
    private short age;
    private String identityNumber;
}
