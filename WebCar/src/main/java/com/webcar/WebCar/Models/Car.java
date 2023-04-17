package com.webcar.WebCar.Models;

import javax.persistence.*;

import lombok.*;

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

    @Getter
    @Setter
    private User user;
}
