package com.tobeto.rent.a.car.services.abstracts;

import com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndPriceResponse;
import com.tobeto.rent.a.car.services.dtos.cardPayment.requests.AddCardPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cardPayment.requests.UpdateCardPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cardPayment.responses.GetListCardNumberResponse;
import com.tobeto.rent.a.car.services.dtos.cardPayment.responses.GetListInstalmentNumberResponse;

import java.util.List;

public interface CardPaymentService {
    void addCardPayment (AddCardPaymentRequest addCardPaymentRequest);
    void updateCardPayment (UpdateCardPaymentRequest updateCardPaymentRequest);
    void deleteCardPayment (int id);
    List<GetListCardNumberResponse> getByCardNumber (String cardNumber);
    List<GetListInstalmentNumberResponse> getByInstalmentNumber (short instalmentNumber);
}
