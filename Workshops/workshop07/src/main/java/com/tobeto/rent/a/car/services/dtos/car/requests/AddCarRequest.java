package com.tobeto.rent.a.car.services.dtos.car.requests;

import lombok.Data;

@Data
public class AddCarRequest {
    private int modelYear;
    private String modelName;
    private int weeklyAmount;
}
