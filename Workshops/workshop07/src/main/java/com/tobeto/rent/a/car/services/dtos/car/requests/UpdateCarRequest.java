package com.tobeto.rent.a.car.services.dtos.car.requests;

import lombok.Data;

@Data
public class UpdateCarRequest {
    private int id;
    private int modelYear;
    private String modelName;
    private int weeklyAmount;
}
