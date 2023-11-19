package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;

import java.util.List;

@Table (name = "customers")
@Entity
public class Customer {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "phone_number")
    private String phone;

    @Column (name = "customer_number")
    private int customer_number;

    @OneToMany (mappedBy = "customer")
    private List<IndividualCustomer> individualCustomers;

    @OneToMany (mappedBy = "customer")
    private List<CorporateCustomer> corporateCustomers;

    @OneToMany (mappedBy = "customer")
    private List<LeasingSystem> leasingSystems;
}
