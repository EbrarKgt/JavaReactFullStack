package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.entities.Car;
import com.tobeto.rent.a.car.repositories.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarsController {
    private final CarRepository carRepository;
    public CarsController(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @GetMapping //Read
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @PostMapping //Create
    public void addCar (@RequestBody Car car){
        carRepository.save(car);
    }

    @DeleteMapping("{id}") //Delete
    public void deleteCar (@PathVariable int id){
        Car carToDelete = carRepository.findById(id).orElseThrow();
        carRepository.delete(carToDelete);
    }

    @PutMapping("{id}") //Update
    public void updateCar (@RequestBody Car car, @PathVariable int id) {
        Car carToUpdate = carRepository.findById(id).orElseThrow();
        carToUpdate.setModelYear(car.getModelYear());
        carToUpdate.setModelName(car.getModelName());
        carToUpdate.setWeeklyAmount(car.getWeeklyAmount());
        carRepository.save(carToUpdate);
    }

}
