package com.tobeto.rent.a.car.services.dtos.car.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetListModelYearAndModelNameResponse {
    int modelYear;
    String modelName;
}
