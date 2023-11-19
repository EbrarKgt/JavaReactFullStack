package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;

@Table (name = "card_payment")
@Entity
public class CardPayment {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "card_number")
    private String card_number;

    @Column (name = "instalment_number")
    private short instalment_number;

    @ManyToOne
    @JoinColumn (name = "payment_method_id")
    private PaymentMethod paymentMethod;

}
