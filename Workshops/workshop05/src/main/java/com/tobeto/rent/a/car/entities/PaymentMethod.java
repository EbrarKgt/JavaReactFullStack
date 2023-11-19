package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;
import org.springframework.core.SpringVersion;

import java.util.List;

@Table(name = "payment_method")
@Entity
public class PaymentMethod {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "payment_type")
    private String payment_type;

    @OneToMany (mappedBy = "paymentMethod")
    private List<CardPayment> cardPayments;

    @OneToMany (mappedBy = "paymentMethod")
    private List<CashPayment> cashPayments;

    @OneToMany (mappedBy = "paymentMethod")
    private List<LeasingSystem> leasingSystems;
}
