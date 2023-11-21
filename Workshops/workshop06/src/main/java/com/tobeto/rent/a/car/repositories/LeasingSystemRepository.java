package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.LeasingSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeasingSystemRepository extends JpaRepository <LeasingSystem, Integer> {
}
