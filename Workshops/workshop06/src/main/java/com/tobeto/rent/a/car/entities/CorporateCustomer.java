package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table (name = "corporate_customer")
@Entity
@Getter
@Setter
public class CorporateCustomer {

    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "tax_number")
    private String taxNumber;

    @Column (name = "tax_office_name")
    private String taxOfficeName;

    @Column (name = "company_name")
    private String companyName;

    @ManyToOne
    @JoinColumn (name = "customer_id")
    private Customer customer;
}
