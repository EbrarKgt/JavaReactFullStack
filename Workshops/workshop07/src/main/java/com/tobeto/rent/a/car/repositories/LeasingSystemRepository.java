package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.LeasingSystem;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.responses.GetListDateResponse;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.responses.GetListReturnResponse;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface LeasingSystemRepository extends JpaRepository <LeasingSystem, Integer> {

    //finding records of leased vehicles in the searched date range
    @Query ("SELECT new com.tobeto.rent.a.car.services.dtos.leasingSystem.responses.GetListDateResponse (ls.id, ls.rentingDate, ls.returnDate)" +
            "FROM LeasingSystem ls WHERE ls.rentingDate BETWEEN :rentingDate AND :returnDate OR ls.rentingDate BETWEEN :rentingDate AND :returnDate")
    List<GetListDateResponse> findByDateRange(LocalDate rentingDate, LocalDate returnDate);

    //returns unreturned cars
    @Query("SELECT new com.tobeto.rent.a.car.services.dtos.leasingSystem.responses.GetListReturnResponse (ls.id, ls.rentingDate, ls.returnDate)" +
            "FROM LeasingSystem ls WHERE ls.returnDate > CURRENT_DATE")
    List<GetListReturnResponse> findCustomersWithPendingReturns();
}
