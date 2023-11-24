package com.tobeto.rent.a.car.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Table(name = "cars")
@Entity
@Getter
@Setter
public class Car {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "model_year")
    private int modelYear;

    @Column (name = "model_name")
    private String modelName;

    @Column (name = "weekly_amount")
    private double weeklyAmount;

    @OneToMany (mappedBy = "car")
    @JsonIgnore
    private List<LeasingSystem> leasingSystems;

    }

















