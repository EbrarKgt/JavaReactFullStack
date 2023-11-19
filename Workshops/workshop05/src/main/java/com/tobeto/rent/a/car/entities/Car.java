package com.tobeto.rent.a.car.entities;

import jakarta.persistence.*;

import java.util.List;


@Table(name = "cars")
@Entity
public class Car {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "model_year")
    private int model_year;

    @Column (name = "model_name")
    private String model_name;

    @Column (name = "weekly_amount")
    private double weekly_amount;

    @OneToMany (mappedBy = "car")
    private List<LeasingSystem> leasingSystems;

    }

















