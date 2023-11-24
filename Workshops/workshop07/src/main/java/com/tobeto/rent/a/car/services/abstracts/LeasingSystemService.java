package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.AddLeasingSystemRequest;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.UpdateLeasingSystemRequest;

public interface LeasingSystemService {
    void addLeasingSystem (AddLeasingSystemRequest addLeasingSystemRequest);
    void updateLeasingSystem (UpdateLeasingSystemRequest updateLeasingSystemRequest);
    void deleteLeasingSystem (int id);
}
