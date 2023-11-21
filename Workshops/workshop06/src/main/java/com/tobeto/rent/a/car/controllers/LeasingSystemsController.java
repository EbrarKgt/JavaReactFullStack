package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.entities.IndividualCustomer;
import com.tobeto.rent.a.car.entities.LeasingSystem;
import com.tobeto.rent.a.car.repositories.LeasingSystemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leasing-system")
public class LeasingSystemsController {
    private final LeasingSystemRepository leasingSystemRepository;

    public LeasingSystemsController (LeasingSystemRepository leasingSystemRepository){
        this.leasingSystemRepository = leasingSystemRepository;
    }

    @GetMapping
    public List<LeasingSystem> getAll(){
        return leasingSystemRepository.findAll();
    }

    @PostMapping
    public void addLeasingSystem (@RequestBody LeasingSystem leasingSystem){
        leasingSystemRepository.save(leasingSystem);
    }

    @DeleteMapping("{id}")
    public void deleteLeasingSystem (@PathVariable int id){
        LeasingSystem leasingSystemToDelete = leasingSystemRepository.findById(id).orElseThrow();
        leasingSystemRepository.delete(leasingSystemToDelete);
    }

    @PutMapping
    public void updateLeasingSystem (@PathVariable int id, @RequestBody LeasingSystem leasingSystem){
        LeasingSystem leasingSystemToUpdate = leasingSystemRepository.findById(id).orElseThrow();
        leasingSystemToUpdate.setRenting_date(leasingSystem.getRenting_date());
        leasingSystemToUpdate.setReturn_date(leasingSystem.getReturn_date());
    }

}
