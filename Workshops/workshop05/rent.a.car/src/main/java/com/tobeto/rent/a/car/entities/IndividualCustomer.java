package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;

@Table (name = "individual_customer")
@Entity
public class IndividualCustomer {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "address")
    private String address;


    @ManyToOne
    @JoinColumn (name = "customer_id")
    private Customer customer;


}
