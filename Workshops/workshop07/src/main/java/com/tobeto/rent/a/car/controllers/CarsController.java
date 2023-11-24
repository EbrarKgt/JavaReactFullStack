package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.entities.Car;
import com.tobeto.rent.a.car.repositories.CarRepository;
import com.tobeto.rent.a.car.services.abstracts.CarService;
import com.tobeto.rent.a.car.services.dtos.car.requests.AddCarRequest;
import com.tobeto.rent.a.car.services.dtos.car.requests.UpdateCarRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarsController {

    private final CarService carService;
    public CarsController(CarService carService){
        this.carService = carService;
    }

    @PostMapping
    public void addCar (@RequestBody AddCarRequest addCarRequest){
        carService.addCar(addCarRequest);
    }

    @PutMapping
    public void updateCar (@RequestBody UpdateCarRequest updateCarRequest) {
        carService.updateCar(updateCarRequest);
    }

    @DeleteMapping("{id}")
    public void deleteCar (@PathVariable int id) {
        carService.deleteCar(id);
    }
}
