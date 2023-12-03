package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.services.abstracts.CashPaymentService;
import com.tobeto.rent.a.car.services.dtos.cashPayment.requests.AddCashPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cashPayment.requests.UpdateCashPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cashPayment.responses.GetListExchangeTypeResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cash-payments")
public class CashPaymentsController {

    private final CashPaymentService cashPaymentService;

    public CashPaymentsController (CashPaymentService cashPaymentService) {
        this.cashPaymentService = cashPaymentService;
    }

    @PostMapping
    public void addCashPayment (@RequestBody AddCashPaymentRequest addCashPaymentRequest){
        cashPaymentService.addCashPayment(addCashPaymentRequest);
    }

    @PutMapping
    public void updateCashPayment (@RequestBody UpdateCashPaymentRequest updateCashPaymentRequest){
        cashPaymentService.updateCashPayment(updateCashPaymentRequest);
    }

    @DeleteMapping("{id}")
    public void deleteCashPayment (@PathVariable int id){
        cashPaymentService.deleteCashPayment(id);
    }

    @GetMapping ("exchange-type")
    public List <GetListExchangeTypeResponse> getByType (@RequestParam String exchange_type){
        return cashPaymentService.getByType(exchange_type);
    }
}
