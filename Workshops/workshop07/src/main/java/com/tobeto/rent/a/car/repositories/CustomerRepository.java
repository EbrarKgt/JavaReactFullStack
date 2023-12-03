package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.Customer;
import com.tobeto.rent.a.car.services.dtos.customer.responses.GetListPhoneResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository <Customer, Integer> {

    //returns telephone numbers containing special characters
    @Query("SELECT new com.tobeto.rent.a.car.services.dtos.customer.responses.GetListPhoneResponse (c.phone, c.customerNumber)" +
            "FROM Customer c WHERE c.phone LIKE '%(%' OR c.phone LIKE '%-%'")
    List <GetListPhoneResponse> findByPhoneContaining ();
}
