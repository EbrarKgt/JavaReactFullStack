package com.tobeto.rent.a.car.services.concretes;

import com.tobeto.rent.a.car.entities.Car;
import com.tobeto.rent.a.car.entities.CashPayment;
import com.tobeto.rent.a.car.repositories.CarRepository;
import com.tobeto.rent.a.car.repositories.CashPaymentRepository;
import com.tobeto.rent.a.car.services.abstracts.CashPaymentService;
import com.tobeto.rent.a.car.services.dtos.car.requests.AddCarRequest;
import com.tobeto.rent.a.car.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.rent.a.car.services.dtos.cashPayment.requests.AddCashPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cashPayment.requests.UpdateCashPaymentRequest;

public class CashPaymentManager implements CashPaymentService {

    private final CashPaymentRepository cashPaymentRepository;

    public CashPaymentManager (CashPaymentRepository cashPaymentRepository){
        this.cashPaymentRepository = cashPaymentRepository;
    }


    @Override
    public void addCashPayment(AddCashPaymentRequest addCashPaymentRequest) {
        CashPayment cashPayment = new CashPayment();
        cashPayment.setExchangeType(addCashPaymentRequest.getExchangeType());
        cashPaymentRepository.save(cashPayment);
    }

    @Override
    public void updateCashPayment(UpdateCashPaymentRequest updateCashPaymentRequest) {
        CashPayment cashPaymentToUpdate = cashPaymentRepository.findById(updateCashPaymentRequest.getId()).orElseThrow();
        cashPaymentToUpdate.setExchangeType(updateCashPaymentRequest.getExchangeType());
        cashPaymentRepository.save(cashPaymentToUpdate);
    }

    @Override
    public void deleteCashPayment(int id) {
        CashPayment cashPaymentToDelete = cashPaymentRepository.findById(id).orElseThrow();
        cashPaymentRepository.delete(cashPaymentToDelete);
    }
}
