package com.tobeto.rent.a.car.services.dtos.leasingSystem.requests;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AddLeasingSystemRequest {
    private LocalDate renting_date;
    private LocalDate return_date;
}
