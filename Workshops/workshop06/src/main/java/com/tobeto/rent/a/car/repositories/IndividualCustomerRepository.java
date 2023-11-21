package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualCustomerRepository extends JpaRepository <IndividualCustomer, Integer> {
}
