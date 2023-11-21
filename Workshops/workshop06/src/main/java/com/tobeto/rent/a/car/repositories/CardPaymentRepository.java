package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.CardPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardPaymentRepository extends JpaRepository <CardPayment, Integer> {
}

