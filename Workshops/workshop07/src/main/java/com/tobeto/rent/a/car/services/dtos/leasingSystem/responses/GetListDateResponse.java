package com.tobeto.rent.a.car.services.dtos.leasingSystem.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetListDateResponse {

    private int id;
    private LocalDate renting_date;
    private LocalDate return_date;
}
