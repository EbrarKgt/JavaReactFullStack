package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table (name = "customers")
@Entity
@Getter
@Setter
public class Customer {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "phone_number")
    private String phone;

    @Column (name = "customer_number")
    private int customerNumber;

    @OneToMany (mappedBy = "customer")
    private List<IndividualCustomer> individualCustomers;

    @OneToMany (mappedBy = "customer")
    private List<CorporateCustomer> corporateCustomers;

    @OneToMany (mappedBy = "customer")
    private List<LeasingSystem> leasingSystems;
}
