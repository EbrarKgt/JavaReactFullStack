package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.services.abstracts.CardPaymentService;
import com.tobeto.rent.a.car.services.dtos.cardPayment.requests.AddCardPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cardPayment.requests.UpdateCardPaymentRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/card-payments")
public class CardPaymentsController {
    private final CardPaymentService cardPaymentService;

    public CardPaymentsController(CardPaymentService cardPaymentService) {
        this.cardPaymentService = cardPaymentService;
    }

    @PostMapping
    public void addCardPayment (@RequestBody AddCardPaymentRequest addCardPaymentRequest) {
        cardPaymentService.addCardPayment(addCardPaymentRequest);
    }

    @PutMapping
    public void updateCardPayment (@RequestBody UpdateCardPaymentRequest updateCardPaymentRequest){
        cardPaymentService.updateCardPayment(updateCardPaymentRequest);
    }

    @DeleteMapping("{id}")
    public void deleteCardPayment (@PathVariable int id){
        cardPaymentService.deleteCardPayment(id);
    }
}
