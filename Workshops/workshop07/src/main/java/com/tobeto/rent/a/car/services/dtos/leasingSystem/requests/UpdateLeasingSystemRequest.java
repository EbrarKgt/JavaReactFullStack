package com.tobeto.rent.a.car.services.dtos.leasingSystem.requests;

import java.time.LocalDate;
import lombok.Data;

@Data
public class UpdateLeasingSystemRequest {
    private int id;
    private LocalDate renting_date;
    private LocalDate return_date;
}
