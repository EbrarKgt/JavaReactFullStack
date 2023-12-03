package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.IndividualCustomer;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.responses.GetListCustomerNameAndAgeResponse;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.responses.GetListNameSortedResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IndividualCustomerRepository extends JpaRepository <IndividualCustomer, Integer> {

    //finding customers older than the entered age value in ascending order
    @Query("SELECT new com.tobeto.rent.a.car.services.dtos.individualCustomer.responses.GetListCustomerNameAndAgeResponse (c.name, c.surname, c.age)" +
            "FROM IndividualCustomer c WHERE c.age > :age ORDER BY c.age")
    List<GetListCustomerNameAndAgeResponse> findByAge (int age);

    //finding all names sorted
    @Query("SELECT new com.tobeto.rent.a.car.services.dtos.individualCustomer.responses.GetListNameSortedResponse (c.name, c.surname, c.age, c.identityNumber)" +
            "FROM IndividualCustomer c ORDER BY c.name ASC")
    List<GetListNameSortedResponse> findAllSortedByName();
}
