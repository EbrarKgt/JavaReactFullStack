package com.tobeto.rent.a.car.services.concretes;

import com.tobeto.rent.a.car.entities.CardPayment;
import com.tobeto.rent.a.car.repositories.CardPaymentRepository;
import com.tobeto.rent.a.car.services.abstracts.CardPaymentService;
import com.tobeto.rent.a.car.services.dtos.car.responses.GetListModelYearAndModelNameResponse;
import com.tobeto.rent.a.car.services.dtos.cardPayment.requests.AddCardPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cardPayment.requests.UpdateCardPaymentRequest;
import com.tobeto.rent.a.car.services.dtos.cardPayment.responses.GetListCardNumberResponse;
import com.tobeto.rent.a.car.services.dtos.cardPayment.responses.GetListInstalmentNumberResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardPaymentManager implements CardPaymentService {

    private final CardPaymentRepository cardPaymentRepository;

    public CardPaymentManager(CardPaymentRepository cardPaymentRepository){
        this.cardPaymentRepository = cardPaymentRepository;
    }

    @Override
    public void addCardPayment(AddCardPaymentRequest addCardPaymentRequest) {
        CardPayment cardPayment = new CardPayment();
        cardPayment.setCardNumber(addCardPaymentRequest.getCardNumber());
        cardPayment.setInstalmentNumber(addCardPaymentRequest.getInstalmentNumber());
        cardPaymentRepository.save(cardPayment);
    }

    @Override
    public void updateCardPayment(UpdateCardPaymentRequest updateCardPaymentRequest) {
        CardPayment cardPaymentToUpdate = cardPaymentRepository.findById(updateCardPaymentRequest.getId()).orElseThrow();
        cardPaymentToUpdate.setCardNumber(updateCardPaymentRequest.getCardNumber());
        cardPaymentToUpdate.setInstalmentNumber(updateCardPaymentRequest.getInstalmentNumber());
        cardPaymentRepository.save(cardPaymentToUpdate);

    }

    @Override
    public void deleteCardPayment(int id) {
        CardPayment cardPaymentToDelete = cardPaymentRepository.findById(id).orElseThrow();
        cardPaymentRepository.delete(cardPaymentToDelete);

    }
/*
    @Override
    public List<GetListCardNumberResponse> getByCardNumber(String cardNumber) {
        if (cardNumber.length() < 6) {
            throw new IllegalArgumentException("You must enter at least 6 digits to make a search..");
        }
        List<GetListCardNumberResponse> cardNumberResult = cardPaymentRepository.findByCardNumberStartingWith(cardNumber);

        if (cardNumberResult.isEmpty()){
            throw new RuntimeException("There are no records that are a match for your search.");
        }
        return cardNumberResult;
    }

    @Override
    public List<GetListInstalmentNumberResponse> getByInstalmentNumber(short instalmentNumber) {
        return cardPaymentRepository.findByInstalmentNumberLessThan(instalmentNumber);
    }*/
}
