package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.cardPayment.requests.AddCardPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cardPayment.requests.UpdateCardPaymentRequest;

public interface CardPaymentService {
    void addCardPayment (AddCardPaymentRequest addCardPaymentRequest);
    void updateCardPayment (UpdateCardPaymentRequest updateCardPaymentRequest);
    void deleteCardPayment (int id);
}
