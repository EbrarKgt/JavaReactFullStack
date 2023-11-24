package com.tobeto.rent.a.car.services.dtos.cashPayment.requests;

import lombok.Data;

@Data
public class UpdateCashPaymentRequest {
    private int id;
    private String exchangeType;
}
