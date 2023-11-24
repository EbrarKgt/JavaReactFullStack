package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository <Car, Integer> {

}
