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

    @Column (name = "name")
    private String name;

    @Column (name = "surname")
    private String surname;

    @Column (name = "age")
    private short age;

    @Column (name = "phone_number")
    private String phone;

    @Column (name = "drivers_license")
    private String drivers_license;

    @OneToMany (mappedBy = "customer")
    private List<IndividualCustomer> individualCustomers;

    @OneToMany (mappedBy = "customer")
    private List<CorporateCustomer> corporateCustomers;

    @OneToMany (mappedBy = "customer")
    private List<LeasingSystem> leasingSystems;
}
