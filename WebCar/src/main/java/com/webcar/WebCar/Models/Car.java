package com.webcar.WebCar.Models;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Column
    @Getter
    @Setter
    private String model;
    @Column
    @Getter
    @Setter
    private String price;
}
