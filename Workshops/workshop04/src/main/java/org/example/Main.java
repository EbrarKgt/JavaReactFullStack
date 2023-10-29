package org.example;

import org.example.business.CarManager;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car("Porsche", "Cayenne", 1200000, 3, 2019, 4,
                "F segment", "SUV", "Diesel", "Black");

        CarManager carManager = new CarManager(new JdbcCarDao());
        //CarManager carManager1 =new CarManager(new HibernateCarDao());
        carManager.add(car1);
        carManager.update(car1);
        //carManager.delete(car1);
        //carManager.update(car1);
    }
}