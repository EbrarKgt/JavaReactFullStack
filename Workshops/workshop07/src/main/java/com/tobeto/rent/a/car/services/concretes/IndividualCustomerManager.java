package com.tobeto.rent.a.car.services.concretes;

import com.tobeto.rent.a.car.entities.IndividualCustomer;
import com.tobeto.rent.a.car.repositories.IndividualCustomerRepository;
import com.tobeto.rent.a.car.services.abstracts.IndividualCustomerService;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.requests.AddIndividualCustomerRequest;
import com.tobeto.rent.a.car.services.dtos.individualCustomer.requests.UpdateIndividualCustomerRequest;
import org.springframework.stereotype.Service;

@Service
public class IndividualCustomerManager implements IndividualCustomerService {

    private final IndividualCustomerRepository individualCustomerRepository;

    public IndividualCustomerManager (IndividualCustomerRepository individualCustomerRepository){
        this.individualCustomerRepository = individualCustomerRepository;
    }

    @Override
    public void addIndividualCustomer(AddIndividualCustomerRequest addIndividualCustomerRequest) {
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setName(addIndividualCustomerRequest.getName());
        individualCustomer.setSurname(addIndividualCustomerRequest.getSurname());
        individualCustomer.setAge(addIndividualCustomerRequest.getAge());
        individualCustomer.setIdentityNumber(addIndividualCustomerRequest.getIdentityNumber());
        individualCustomerRepository.save(individualCustomer);
    }

    @Override
    public void updateIndividualCustomer(UpdateIndividualCustomerRequest updateIndividualCustomerRequest) {
        IndividualCustomer individualCustomerToUpdate = individualCustomerRepository.findById(updateIndividualCustomerRequest.getId()).orElseThrow();
        individualCustomerToUpdate.setName(updateIndividualCustomerRequest.getName());
        individualCustomerToUpdate.setSurname(updateIndividualCustomerRequest.getSurname());
        individualCustomerToUpdate.setAge(updateIndividualCustomerRequest.getAge());
        individualCustomerToUpdate.setIdentityNumber(updateIndividualCustomerRequest.getIdentityNumber());
        individualCustomerRepository.save(individualCustomerToUpdate);
    }

    @Override
    public void deleteIndividualCustomer(int id) {
        IndividualCustomer individualCustomerToDelete = individualCustomerRepository.findById(id).orElseThrow();
        individualCustomerRepository.delete(individualCustomerToDelete);
    }
}
