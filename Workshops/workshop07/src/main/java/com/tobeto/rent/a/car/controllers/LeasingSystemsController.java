package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.services.abstracts.LeasingSystemService;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.AddLeasingSystemRequest;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.requests.UpdateLeasingSystemRequest;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.responses.GetListDateResponse;
import com.tobeto.rent.a.car.services.dtos.leasingSystem.responses.GetListReturnResponse;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/leasing-system")
public class LeasingSystemsController {
    private final LeasingSystemService leasingSystemService;

    public LeasingSystemsController(LeasingSystemService leasingSystemService) {
        this.leasingSystemService = leasingSystemService;
    }

    @PostMapping
    public void addLeasingSystem(@RequestBody AddLeasingSystemRequest addLeasingSystemRequest) {
        leasingSystemService.addLeasingSystem(addLeasingSystemRequest);
    }

    @PutMapping
    public void updateLeasingSystem(@RequestBody UpdateLeasingSystemRequest updateLeasingSystemRequest) {
        leasingSystemService.updateLeasingSystem(updateLeasingSystemRequest);
    }

    @DeleteMapping("{id}")
    public void deleteLeasingSystem(@PathVariable int id) {
        leasingSystemService.deleteLeasingSystem(id);
    }

    @GetMapping("date-between")
    public List<GetListDateResponse> getByDate(@RequestParam LocalDate rentingDate, @RequestParam LocalDate returnDate) {
        return leasingSystemService.getByDate(rentingDate, returnDate);
    }

    @GetMapping ("unreturned-car")
    public List<GetListReturnResponse> getByCustomer (){
        return leasingSystemService.getByCustomer();
    }
}
