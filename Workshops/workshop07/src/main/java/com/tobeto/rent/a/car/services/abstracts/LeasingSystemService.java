package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.AddLeasingSystemRequest;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.UpdateLeasingSystemRequest;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.responses.GetListDateResponse;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.responses.GetListReturnResponse;

import java.time.LocalDate;
import java.util.List;

public interface LeasingSystemService {
    void addLeasingSystem (AddLeasingSystemRequest addLeasingSystemRequest);
    void updateLeasingSystem (UpdateLeasingSystemRequest updateLeasingSystemRequest);
    void deleteLeasingSystem (int id);
    List<GetListDateResponse> getByDate (LocalDate rentingDate, LocalDate returnDate);
    List<GetListReturnResponse> getByCustomer ();
}
