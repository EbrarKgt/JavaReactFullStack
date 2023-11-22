package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.entities.PaymentMethod;
import com.tobeto.rent.a.car.repositories.PaymentMethodRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/payment-methods")
public class PaymentMethodsController {

    private final PaymentMethodRepository paymentMethodRepository;

    public PaymentMethodsController (PaymentMethodRepository paymentMethodRepository){
        this.paymentMethodRepository = paymentMethodRepository;
    }

    @GetMapping  //Read
    public List<PaymentMethod> getAll(){
        return paymentMethodRepository.findAll();
    }

    @PostMapping // Create
    public void addPaymentMethod (@RequestBody PaymentMethod paymentMethod){
        paymentMethodRepository.save(paymentMethod);
    }

    @DeleteMapping("{id}") //Delete
    public void deletePaymentMethod (@PathVariable int id){
        PaymentMethod paymentMethodToDelete = paymentMethodRepository.findById(id).orElseThrow();
        paymentMethodRepository.delete(paymentMethodToDelete);
    }

    @PutMapping //Update
    public void updatePaymentMethod (@PathVariable int id, @RequestBody PaymentMethod paymentMethod){
        PaymentMethod paymentMethodToUpdate = paymentMethodRepository.findById(id).orElseThrow();
        paymentMethodToUpdate.setPaymentType(paymentMethod.getPaymentType());
        paymentMethodRepository.save(paymentMethodToUpdate);
    }
}
