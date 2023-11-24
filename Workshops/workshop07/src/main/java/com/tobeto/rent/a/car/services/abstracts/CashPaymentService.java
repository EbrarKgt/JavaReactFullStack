package com.tobeto.rent.a.car.services.abstracts;


import com.tobeto.rent.a.car.services.dtos.cashPayment.requests.AddCashPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cashPayment.requests.UpdateCashPaymentRequest;

public interface CashPaymentService {
    void addCashPayment (AddCashPaymentRequest addCashPaymentRequest);
    void updateCashPayment (UpdateCashPaymentRequest updateCashPaymentRequest);
    void deleteCashPayment (int id);
}
