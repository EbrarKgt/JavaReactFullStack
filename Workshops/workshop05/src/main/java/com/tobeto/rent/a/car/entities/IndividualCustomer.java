package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;

@Table (name = "individual_customer")
@Entity
public class IndividualCustomer {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "name")
    private String name;

    @Column (name = "surname")
    private String surname;

    @Column (name = "age")
    private short age;

    @Column (name = "identity_number")
    private String identity_number;

    @ManyToOne
    @JoinColumn (name = "customer_id")
    private Customer customer;


}
