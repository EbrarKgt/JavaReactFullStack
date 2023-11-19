package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;

@Table (name = "cash_payment")
@Entity
public class CashPayment {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "currency")
    private int currency;

    @Column (name = "exchange_type")
    private String exchange_type;

    @ManyToOne
    @JoinColumn (name = "payment_method_id")
    private PaymentMethod paymentMethod;
}
