package com.tobeto.rent.a.car.services.concretes;

import com.tobeto.rent.a.car.entities.Car;
import com.tobeto.rent.a.car.repositories.CarRepository;
import com.tobeto.rent.a.car.services.abstracts.CarService;
import com.tobeto.rent.a.car.services.dtos.car.requests.AddCarRequest;
import com.tobeto.rent.a.car.services.dtos.car.requests.UpdateCarRequest;
import org.springframework.stereotype.Service;

@Service
public class CarManager implements CarService {

    private final CarRepository carRepository;

    public CarManager (CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override
    public void addCar (AddCarRequest addCarRequest){
        Car car = new Car();
        car.setModelName(addCarRequest.getModelName());
        car.setModelYear(addCarRequest.getModelYear());
        car.setWeeklyAmount(addCarRequest.getWeeklyAmount());
        carRepository.save(car);
    }

    @Override
    public void updateCar(UpdateCarRequest updateCarRequest) {
        Car carToUpdate = carRepository.findById(updateCarRequest.getId()).orElseThrow();
        Car car = carRepository.findById(updateCarRequest.getId()).orElseThrow();
        carToUpdate.setModelYear(updateCarRequest.getModelYear());
        carToUpdate.setModelName(updateCarRequest.getModelName());
        carToUpdate.setWeeklyAmount(updateCarRequest.getWeeklyAmount());
        carRepository.save(carToUpdate);
    }

    @Override
    public void deleteCar(int id) {
        Car carToDelete = carRepository.findById(id).orElseThrow();
        carRepository.delete(carToDelete);
    }
}
