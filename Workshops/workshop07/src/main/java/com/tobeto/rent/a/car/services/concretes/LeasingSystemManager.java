package com.tobeto.rent.a.car.services.concretes;

import com.tobeto.rent.a.car.entities.LeasingSystem;
import com.tobeto.rent.a.car.repositories.LeasingSystemRepository;
import com.tobeto.rent.a.car.services.abstracts.LeasingSystemService;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.AddLeasingSystemRequest;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.UpdateLeasingSystemRequest;

public class LeasingSystemManager implements LeasingSystemService {

    private final LeasingSystemRepository leasingSystemRepository;

    public LeasingSystemManager (LeasingSystemRepository leasingSystemRepository){
        this.leasingSystemRepository = leasingSystemRepository;
    }

    @Override
    public void addLeasingSystem(AddLeasingSystemRequest addLeasingSystemRequest) {
        LeasingSystem leasingSystem = new LeasingSystem();
        leasingSystem.setRenting_date(addLeasingSystemRequest.getRenting_date());
        leasingSystem.setReturn_date(addLeasingSystemRequest.getReturn_date());
        leasingSystemRepository.save(leasingSystem);
    }

    @Override
    public void updateLeasingSystem(UpdateLeasingSystemRequest updateLeasingSystemRequest) {
        LeasingSystem leasingSystemToUpdate = leasingSystemRepository.findById(updateLeasingSystemRequest.getId()).orElseThrow();
        leasingSystemToUpdate.setRenting_date(updateLeasingSystemRequest.getRenting_date());
        leasingSystemToUpdate.setReturn_date(updateLeasingSystemRequest.getReturn_date());
        leasingSystemRepository.save(leasingSystemToUpdate);
    }

    @Override
    public void deleteLeasingSystem(int id) {
        LeasingSystem leasingSystemToDelete = leasingSystemRepository.findById(id).orElseThrow();
        leasingSystemRepository.delete(leasingSystemToDelete);
    }
}

