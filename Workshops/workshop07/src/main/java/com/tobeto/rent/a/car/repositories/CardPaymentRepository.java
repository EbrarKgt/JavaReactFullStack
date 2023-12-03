package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.CardPayment;
import com.tobeto.rent.a.car.services.dtos.cardPayment.responses.GetListCardNumberResponse;
import com.tobeto.rent.a.car.services.dtos.cardPayment.responses.GetListInstalmentNumberResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CardPaymentRepository extends JpaRepository <CardPayment, Integer> {

    //finding payments by partial card number
    @Query ("SELECT new com.tobeto.rent.a.car.services.dtos.cardPayment.responses.GetListCardNumberResponse(cp.id, cp.cardNumber)" +
            "FROM CardPayment cp WHERE cp.cardNumber LIKE :cardNumber%")
    List <GetListCardNumberResponse> findByCardNumberStartingWith (String cardNumber);

    //sorting payments according to the number of instalments
    @Query ("SELECT new com.tobeto.rent.a.car.services.dtos.cardPayment.responses.GetListInstalmentNumberResponse(cp.id, cp.instalmentNumber)" +
            "FROM CardPayment cp WHERE cp.instalmentNumber < :instalmentNumber ORDER BY cp.instalmentNumber DESC")
    List<GetListInstalmentNumberResponse> findByInstalmentNumberLessThan(short instalmentNumber);
}

