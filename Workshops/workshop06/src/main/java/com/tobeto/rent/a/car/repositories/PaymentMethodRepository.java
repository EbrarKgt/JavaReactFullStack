package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository <PaymentMethod, Integer> {
}
