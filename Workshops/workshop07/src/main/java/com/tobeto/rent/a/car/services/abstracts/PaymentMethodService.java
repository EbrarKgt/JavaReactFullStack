package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.paymentMethod.requests.AddPaymentMethodRequest;
import com.tobeto.rent.a.car.services.dtos.paymentMethod.requests.UpdatePaymentMethodRequest;

public interface PaymentMethodService {
    void addPaymentMethod (AddPaymentMethodRequest addPaymentMethodRequest);
    void updatePaymentMethod (UpdatePaymentMethodRequest updatePaymentMethodRequest);
    void deletePaymentMethod (int id);
}
