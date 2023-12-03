package com.tobeto.rent.a.car.repositories;

import com.tobeto.rent.a.car.entities.CorporateCustomer;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.responses.GetListCompanyNameOrderedResponse;
import com.tobeto.rent.a.car.services.dtos.corporateCustomer.responses.GetListCompanyNameResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CorporateCustomerRepository extends JpaRepository <CorporateCustomer, Integer> {

    //finding company customer records connected to the entered tax office
    @Query("SELECT new com.tobeto.rent.a.car.services.dtos.corporateCustomer.responses.GetListCompanyNameResponse (corpc.id, corpc.taxNumber, corpc.taxOfficeName, corpc.companyName)" +
    "FROM CorporateCustomer corpc WHERE UPPER(corpc.taxOfficeName) = UPPER (:taxOfficeName)")
    List<GetListCompanyNameResponse> findByName (String taxOfficeName);

    //sequential acquisition of company customer records
    @Query ("SELECT new com.tobeto.rent.a.car.services.dtos.corporateCustomer.responses.GetListCompanyNameOrderedResponse (corpc.id, corpc.companyName)" +
            "FROM CorporateCustomer corpc WHERE UPPER(corpc.companyName) > UPPER(:companyName) ORDER BY UPPER(corpc.companyName) ASC")
    List<GetListCompanyNameOrderedResponse> findCompaniesAfterNameAlphabeticallySorted (String companyName);
}
