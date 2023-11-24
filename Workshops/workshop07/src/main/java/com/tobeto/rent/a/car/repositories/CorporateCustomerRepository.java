package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.CorporateCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateCustomerRepository extends JpaRepository <CorporateCustomer, Integer> {
}
