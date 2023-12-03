package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.car.requests.AddCarRequest;
import com.tobeto.rent.a.car.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndModelNameResponse;
import com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndPriceResponse;

import java.util.List;

public interface CarService {
    void addCar (AddCarRequest addCarRequest);
    void updateCar (UpdateCarRequest updateCarRequest);
    void deleteCar (int id);
    List<GetListModelYearAndPriceResponse> getByYearAndPrice (int modelYear, double weeklyAmount);
    List<GetListModelYearAndModelNameResponse> getByYearAndName (int modelYear, String modelName);
}
