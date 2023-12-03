package com.tobeto.rent.a.car.services.dtos.cardPayment.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetListInstalmentNumberResponse {
    private int id;
    private short instalmentNumber;
}
