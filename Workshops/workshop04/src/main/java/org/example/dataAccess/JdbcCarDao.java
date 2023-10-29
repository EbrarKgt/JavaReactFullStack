package org.example.dataAccess;

import org.example.entities.Car;

public class JdbcCarDao implements CarDao {
    @Override
    public void add(Car car) {
        System.out.println("The new information package for " + car.getBrand() + " has been added to the database using JDBC.");
        System.out.println("*****************");
    }

    @Override
    public void update(Car car) {
        System.out.println("The information package for " + car.getBrand() + " has been updated using JDBC.");
        System.out.println("*****************");
    }

    @Override
    public void delete(Car car) {
        System.out.println("The information package for " + car.getBrand() + " has been deleted using JDBC.");
        System.out.println("*****************");

    }
}
