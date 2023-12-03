package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.services.abstracts.CarService;
import com.tobeto.rent.a.car.services.dtos.car.requests.AddCarRequest;
import com.tobeto.rent.a.car.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndModelNameResponse;
import com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndPriceResponse;
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

    @GetMapping("year-and-price")
    public List<GetListModelYearAndPriceResponse> getbByYearAndPrice(@RequestParam int modelYear, @RequestParam double weeklyAmount){
        return carService.getByYearAndPrice(modelYear, weeklyAmount);
    }

    @GetMapping ("year-and-name")
    public List <GetListModelYearAndModelNameResponse> getByYearAndName (@RequestParam int modelYear, @RequestParam String modelName){
        return carService.getByYearAndName(modelYear, modelName);
    }
}
