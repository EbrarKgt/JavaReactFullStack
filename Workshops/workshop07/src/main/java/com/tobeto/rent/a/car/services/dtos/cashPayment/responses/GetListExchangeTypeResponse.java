package com.tobeto.rent.a.car.services.dtos.cashPayment.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetListExchangeTypeResponse {
    private int id;
    private String exchangeType;
}
