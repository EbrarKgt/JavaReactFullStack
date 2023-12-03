package com.tobeto.rent.a.car.services.concretes;

import com.tobeto.rent.a.car.entities.Car;
import com.tobeto.rent.a.car.repositories.CarRepository;
import com.tobeto.rent.a.car.services.abstracts.CarService;
import com.tobeto.rent.a.car.services.dtos.car.requests.AddCarRequest;
import com.tobeto.rent.a.car.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndModelNameResponse;
import com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndPriceResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManager implements CarService {

    private final CarRepository carRepository;

    public CarManager(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void addCar(AddCarRequest addCarRequest) {
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

    @Override
    public List<GetListModelYearAndPriceResponse> getByYearAndPrice(int modelYear, double weeklyAmount) {
        List<GetListModelYearAndPriceResponse> cars = carRepository.findByModelYearGreaterThanAndWeeklyAmountLessThan(modelYear, weeklyAmount);
        if (cars.isEmpty()) {
            throw new RuntimeException("No vehicles matching your search criteria were found.");
        }
        return cars;
    }

    @Override
    public List<GetListModelYearAndModelNameResponse> getByYearAndName(int modelYear, String modelName) {
        List<GetListModelYearAndModelNameResponse> result =  carRepository.findByModelYearGreaterThanAndModelName(modelYear, modelName);
        if (result.isEmpty()){
            throw new RuntimeException("There are no records that are a match for your search.");
        }
        return result;
    }
}
