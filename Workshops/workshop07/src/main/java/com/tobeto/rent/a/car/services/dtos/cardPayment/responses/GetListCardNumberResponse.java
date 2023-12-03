package com.tobeto.rent.a.car.services.dtos.cardPayment.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class GetListCardNumberResponse {
    private int id;
    private String cardNumber;
}
