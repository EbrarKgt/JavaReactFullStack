package org.example.business;

import org.example.dataAccess.CarDao;
import org.example.entities.Car;

public class CarManager {
    private CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    public void add(Car car) throws Exception {
        if ((car.getBrand().length() < 5) || (car.getBrand().length() > 15)) {
            throw new Exception("The length of the brand name should be in the range of 3-15 characters.");
        }
        if (car.getModel().length() < 1) {
            throw new Exception("Every car must have a model which belongs its brand.");
        }
        if (car.getPrice() < 1000) {
            throw new Exception("Each car must have a market average price");
        }
        if (car.getStockQuantity() < 1) {
            throw new Exception("At least one stock should be kept for each vehicle.");
        }
        if (car.getSegment().length() < 1) {
            throw new Exception("Enter a valid segment. (e.g. A/B/C/D/E/F segment)");
        } else {
            carDao.add(car);
        }
    }

    public void update(Car car) {
        carDao.update(car);
    }

    public void delete(Car car) {
        carDao.delete(car);
    }
}

