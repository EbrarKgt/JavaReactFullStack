package com.tobeto.rent.a.car.services.dtos.cardPayment.requests;

import lombok.Data;

@Data
public class UpdateCardPaymentRequest {
    private int id;
    private String cardNumber;
    private short instalmentNumber;
}
