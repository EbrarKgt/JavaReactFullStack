package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Integer> {
}
