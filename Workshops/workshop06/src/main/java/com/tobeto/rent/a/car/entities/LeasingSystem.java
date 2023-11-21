package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Table (name = "leasing_system")
@Entity
@Getter
@Setter
public class LeasingSystem {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "renting_date")
    private LocalDate renting_date;

    @Column (name = "return_date")
    private LocalDate return_date;

    @ManyToOne
    @JoinColumn (name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn (name = "payment_method_id")
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn (name = "car_id")
    private Car car;
}
