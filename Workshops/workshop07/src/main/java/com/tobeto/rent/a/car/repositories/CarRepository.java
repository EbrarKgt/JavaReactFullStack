package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.Car;
import com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndModelNameResponse;
import com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndPriceResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository <Car, Integer> {

    //finding of vehicles with selected year of manufacture and price
    @Query("Select new com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndPriceResponse(c.modelYear, c.weeklyAmount) " +
            "FROM Car c WHERE c.modelYear > :modelYear AND c.weeklyAmount < :weeklyAmount")
    List<GetListModelYearAndPriceResponse> findByModelYearGreaterThanAndWeeklyAmountLessThan(int modelYear, double weeklyAmount);

    //finding vehicles with selected year of manufacture and model
    @Query ("Select new com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndModelNameResponse (c.modelYear, c.modelName) " +
            "FROM Car c WHERE c.modelYear > :modelYear AND UPPER(c.modelName) = UPPER(:modelName)")
    List <GetListModelYearAndModelNameResponse> findByModelYearGreaterThanAndModelName (int modelYear, String modelName);
}
