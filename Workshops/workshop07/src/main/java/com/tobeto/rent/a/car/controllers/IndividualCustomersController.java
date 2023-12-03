package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.services.abstracts.IndividualCustomerService;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.requests.AddIndividualCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.requests.UpdateIndividualCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.responses.GetListCustomerNameAndAgeResponse;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.responses.GetListNameSortedResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/individual-customers")
public class IndividualCustomersController {

    private final IndividualCustomerService individualCustomerService;

    public IndividualCustomersController(IndividualCustomerService individualCustomerService){
        this.individualCustomerService = individualCustomerService;
    }

    @PostMapping
    public void addIndividualCustomer (@RequestBody AddIndividualCustomerRequest addIndividualCustomerRequest){
        individualCustomerService.addIndividualCustomer(addIndividualCustomerRequest);
    }

    @PutMapping
    public void updateIndividualCustomer (@RequestBody UpdateIndividualCustomerRequest updateIndividualCustomerRequest) {
        individualCustomerService.updateIndividualCustomer(updateIndividualCustomerRequest);
    }

    @DeleteMapping("{id}")
    public void deleteIndividualCustomer (@PathVariable int id){
        individualCustomerService.deleteIndividualCustomer(id);
    }

    @GetMapping ("name-and-age")
    public List <GetListCustomerNameAndAgeResponse> getByNameAndAge (@RequestParam int age){
        return individualCustomerService.getByNameAndAge(age);
    }

    @GetMapping("sorted-names")
    public List<GetListNameSortedResponse> getByNameSorted (){
        return individualCustomerService.getByNameSorted();
    }
}
