package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.CashPayment;
import com.tobeto.rent.a.car.services.dtos.cashPayment.responses.GetListExchangeTypeResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CashPaymentRepository extends JpaRepository <CashPayment, Integer> {

        //finding payments of the entered exchange type
        @Query("SELECT new com.tobeto.rent.a.car.services.dtos.cashPayment.responses.GetListExchangeTypeResponse(cp.id, cp.exchangeType)" +
                "FROM CashPayment cp WHERE UPPER (cp.exchangeType) LIKE UPPER(:exchangeType%)")
        List<GetListExchangeTypeResponse> findByExchangeTypeStartingWith(String exchangeType);
}
