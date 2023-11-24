package com.tobeto.rent.a.car.services.dtos.customer.requests;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UpdateCustomerRequest {
    private int id;
    private int customerNumber;
    private String phone;
}
