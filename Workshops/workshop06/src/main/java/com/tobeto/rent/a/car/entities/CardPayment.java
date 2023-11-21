package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table (name = "card_payment")
@Entity
@Getter
@Setter
public class CardPayment {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "card_number")
    private String cardNumber;

    @Column (name = "instalment_number")
    private short instalmentNumber;

    @ManyToOne
    @JoinColumn (name = "payment_method_id")
    private PaymentMethod paymentMethod;

}
