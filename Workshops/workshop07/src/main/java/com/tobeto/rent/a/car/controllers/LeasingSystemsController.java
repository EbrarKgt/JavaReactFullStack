package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.services.abstracts.LeasingSystemService;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.AddLeasingSystemRequest;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.UpdateLeasingSystemRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/leasing-system")
public class LeasingSystemsController {
    private final LeasingSystemService leasingSystemService;

    public LeasingSystemsController (LeasingSystemService leasingSystemService){
        this.leasingSystemService = leasingSystemService;
    }

    @PostMapping
    public void addLeasingSystem (@RequestBody AddLeasingSystemRequest addLeasingSystemRequest){
        leasingSystemService.addLeasingSystem(addLeasingSystemRequest);
    }

    @PutMapping
    public void updateLeasingSystem (@RequestBody UpdateLeasingSystemRequest updateLeasingSystemRequest){
        leasingSystemService.updateLeasingSystem(updateLeasingSystemRequest);
    }

    @DeleteMapping("{id}")
    public void deleteLeasingSystem (@PathVariable int id){
        leasingSystemService.deleteLeasingSystem(id);
    }
}
