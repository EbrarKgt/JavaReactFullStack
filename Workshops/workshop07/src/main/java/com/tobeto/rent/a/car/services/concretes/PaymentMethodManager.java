package com.tobeto.rent.a.car.services.concretes;

import com.tobeto.rent.a.car.entities.PaymentMethod;
import com.tobeto.rent.a.car.repositories.PaymentMethodRepository;
import com.tobeto.rent.a.car.services.abstracts.PaymentMethodService;
import com.tobeto.rent.a.car.services.dtos.paymentMethod.requests.AddPaymentMethodRequest;
import com.tobeto.rent.a.car.services.dtos.paymentMethod.requests.UpdatePaymentMethodRequest;

public class PaymentMethodManager implements PaymentMethodService {

    private final PaymentMethodRepository paymentMethodRepository;

    public PaymentMethodManager (PaymentMethodRepository paymentMethodRepository){
        this.paymentMethodRepository = paymentMethodRepository;
    }

    @Override
    public void addPaymentMethod(AddPaymentMethodRequest addPaymentMethodRequest) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setPaymentType(addPaymentMethodRequest.getPaymentType());
        paymentMethodRepository.save(paymentMethod);
    }

    @Override
    public void updatePaymentMethod(UpdatePaymentMethodRequest updatePaymentMethodRequest) {
        PaymentMethod paymentMethodToUpdate = paymentMethodRepository.findById(updatePaymentMethodRequest.getId()).orElseThrow();
        paymentMethodToUpdate.setPaymentType(updatePaymentMethodRequest.getPaymentType());
        paymentMethodRepository.save(paymentMethodToUpdate);
    }

    @Override
    public void deletePaymentMethod(int id) {
        PaymentMethod paymentMethodToDelete = paymentMethodRepository.findById(id).orElseThrow();
        paymentMethodRepository.delete(paymentMethodToDelete);
    }
}
