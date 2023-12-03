package com.tobeto.rent.a.car.services.dtos.customer.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListPhoneResponse {
    private String phone;
    private int customerNumber;
}
