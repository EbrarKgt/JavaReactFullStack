package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.entities.CardPayment;
import com.tobeto.rent.a.car.repositories.CardPaymentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/card-payments")
public class CardPaymentsController {

    private final CardPaymentRepository cardPaymentRepository;

    public CardPaymentsController(CardPaymentRepository cardPaymentRepository){
        this.cardPaymentRepository = cardPaymentRepository;
    }

    @GetMapping // Read
    public List <CardPayment> getAll(){
        return cardPaymentRepository.findAll();
    }

    @PostMapping // Create
    public void addCardPayment (@RequestBody CardPayment cardPayment) {
        cardPaymentRepository.save(cardPayment);
    }

    @DeleteMapping //Delete
    public void deleteCardPayment (@PathVariable int id){
        CardPayment cardPaymentToDelete = cardPaymentRepository.findById(id).orElseThrow();
        cardPaymentRepository.delete(cardPaymentToDelete);
    }

    @PutMapping ("{id}") //Update
    public void updateCardPayment (@PathVariable int id, @RequestBody CardPayment cardPayment){
        CardPayment cardPaymentToUpdate = cardPaymentRepository.findById(id).orElseThrow();
        cardPaymentToUpdate.setCardNumber(cardPayment.getCardNumber());
        cardPaymentToUpdate.setInstalmentNumber(cardPayment.getInstalmentNumber());
        cardPaymentRepository.save(cardPaymentToUpdate);
    }
}
