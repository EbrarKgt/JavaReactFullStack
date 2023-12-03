package com.tobeto.rent.a.car.services.abstracts;


import com.tobeto.rent.a.car.services.dtos.cashPayment.requests.AddCashPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cashPayment.requests.UpdateCashPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cashPayment.responses.GetListExchangeTypeResponse;

import java.util.List;

public interface CashPaymentService {
    void addCashPayment (AddCashPaymentRequest addCashPaymentRequest);
    void updateCashPayment (UpdateCashPaymentRequest updateCashPaymentRequest);
    void deleteCashPayment (int id);
    List <GetListExchangeTypeResponse> getByType (String exchange_type);
}
