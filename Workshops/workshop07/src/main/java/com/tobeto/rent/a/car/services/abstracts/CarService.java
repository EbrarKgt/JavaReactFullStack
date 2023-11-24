package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.car.requests.AddCarRequest;
import com.tobeto.rent.a.car.services.dtos.car.requests.UpdateCarRequest;

public interface CarService {
    void addCar (AddCarRequest addCarRequest);
    void updateCar (UpdateCarRequest updateCarRequest);
    void deleteCar (int id);
}
