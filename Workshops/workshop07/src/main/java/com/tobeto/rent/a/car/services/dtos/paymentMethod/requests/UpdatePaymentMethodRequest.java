package com.tobeto.rent.a.car.services.dtos.paymentMethod.requests;

import lombok.Data;

@Data
public class UpdatePaymentMethodRequest {
    private int id;
    private String paymentType;
}
