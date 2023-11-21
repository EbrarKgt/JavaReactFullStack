package com.tobeto.rent.a.car.controllers;

import com.tobeto.rent.a.car.entities.CashPayment;
import com.tobeto.rent.a.car.repositories.CashPaymentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cash-payments")
public class CashPaymentsController {

    private final CashPaymentRepository cashPaymentRepository;

    public CashPaymentsController (CashPaymentRepository cashPaymentRepository) {
        this.cashPaymentRepository = cashPaymentRepository;
    }

    @GetMapping
    public List <CashPayment> getAll(){
        return cashPaymentRepository.findAll();
    }

    @PostMapping
    public void addCashPayment (@RequestBody CashPayment cashPayment){
        cashPaymentRepository.save(cashPayment);
    }

    @DeleteMapping("{id}")
    public void deleteCashPayment (@PathVariable int id){
        CashPayment cashPaymentToDelete = cashPaymentRepository.findById(id).orElseThrow();
        cashPaymentRepository.delete(cashPaymentToDelete);
    }

    @PutMapping ("{id}")
    public void updateCashPayment (@PathVariable int id, @RequestBody CashPayment cashPayment){
        CashPayment cashPaymentToUpdate = cashPaymentRepository.findById(id).orElseThrow();
        cashPaymentToUpdate.setCurrency(cashPayment.getCurrency());
        cashPaymentToUpdate.setExchangeType(cashPayment.getExchangeType());
        cashPaymentRepository.save(cashPaymentToUpdate);
    }
}
