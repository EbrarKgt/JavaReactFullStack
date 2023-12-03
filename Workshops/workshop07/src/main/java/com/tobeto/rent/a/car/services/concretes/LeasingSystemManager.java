package com.tobeto.rent.a.car.services.concretes;

import com.tobeto.rent.a.car.entities.LeasingSystem;
import com.tobeto.rent.a.car.repositories.LeasingSystemRepository;
import com.tobeto.rent.a.car.services.abstracts.LeasingSystemService;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.AddLeasingSystemRequest;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.UpdateLeasingSystemRequest;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.responses.GetListDateResponse;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.responses.GetListReturnResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LeasingSystemManager implements LeasingSystemService {

    private final LeasingSystemRepository leasingSystemRepository;

    public LeasingSystemManager (LeasingSystemRepository leasingSystemRepository){
        this.leasingSystemRepository = leasingSystemRepository;
    }

    @Override
    public void addLeasingSystem(AddLeasingSystemRequest addLeasingSystemRequest) {
        LeasingSystem leasingSystem = new LeasingSystem();
        leasingSystem.setRentingDate(addLeasingSystemRequest.getRenting_date());
        leasingSystem.setReturnDate(addLeasingSystemRequest.getReturn_date());
        leasingSystemRepository.save(leasingSystem);
    }

    @Override
    public void updateLeasingSystem(UpdateLeasingSystemRequest updateLeasingSystemRequest) {
        LeasingSystem leasingSystemToUpdate = leasingSystemRepository.findById(updateLeasingSystemRequest.getId()).orElseThrow();
        leasingSystemToUpdate.setRentingDate(updateLeasingSystemRequest.getRenting_date());
        leasingSystemToUpdate.setReturnDate(updateLeasingSystemRequest.getReturn_date());
        leasingSystemRepository.save(leasingSystemToUpdate);
    }

    @Override
    public void deleteLeasingSystem(int id) {
        LeasingSystem leasingSystemToDelete = leasingSystemRepository.findById(id).orElseThrow();
        leasingSystemRepository.delete(leasingSystemToDelete);
    }

    @Override
    public List<GetListDateResponse> getByDate(LocalDate rentingDate, LocalDate returnDate) {
        return leasingSystemRepository.findByDateRange(rentingDate, returnDate);
    }

    @Override
    public List<GetListReturnResponse> getByCustomer() {
        return leasingSystemRepository.findCustomersWithPendingReturns();
    }
}

