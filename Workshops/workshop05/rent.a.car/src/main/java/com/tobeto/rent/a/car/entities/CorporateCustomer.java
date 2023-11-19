package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;

@Table (name = "corporate_customer")
@Entity
public class CorporateCustomer {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "tax_number")
    private String tax_number;

    @Column (name = "tax_office_name")
    private String tax_office_name;

    @Column (name = "company_name")
    private String company_name;

    @ManyToOne
    @JoinColumn (name = "customer_id")
    private Customer customer;
}
