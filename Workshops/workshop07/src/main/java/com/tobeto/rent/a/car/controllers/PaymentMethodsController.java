package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.services.abstracts.PaymentMethodService;
import com.tobeto.rent.a.car.services.dtos.paymentMethod.requests.AddPaymentMethodRequest;
import com.tobeto.rent.a.car.services.dtos.paymentMethod.requests.UpdatePaymentMethodRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/payment-methods")
public class PaymentMethodsController {

    private final PaymentMethodService paymentMethodService;

    public PaymentMethodsController (PaymentMethodService paymentMethodService){
        this.paymentMethodService = paymentMethodService;
    }

    @PostMapping
    public void addPaymentMethod (@RequestBody AddPaymentMethodRequest addPaymentMethodRequest){
        paymentMethodService.addPaymentMethod(addPaymentMethodRequest);
    }

    @PutMapping
    public void updatePaymentMethod (@RequestBody UpdatePaymentMethodRequest updatePaymentMethodRequest){
        paymentMethodService.updatePaymentMethod(updatePaymentMethodRequest);
    }

    @DeleteMapping("{id}")
    public void deletePaymentMethod (@PathVariable int id){
       paymentMethodService.deletePaymentMethod(id);
    }
}
