package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements CarDao {
    @Override
    public void add(Car car) {
        System.out.println("The new information package for " + car.getBrand() + " has been added to the database using Hibernate.");
        System.out.println("*****************");
    }

    @Override
    public void update(Car car) {
        System.out.println("The information package for " + car.getBrand() + " has been updated using Hibernate.");
        System.out.println("*****************");
    }

    @Override
    public void delete(Car car) {
        System.out.println("The information package for " + car.getBrand() + " has been deleted using Hibernate.");
        System.out.println("*****************");
    }
}
