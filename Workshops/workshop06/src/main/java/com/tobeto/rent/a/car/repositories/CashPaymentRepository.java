package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.CashPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashPaymentRepository extends JpaRepository <CashPayment, Integer> {
}
