package com.webcar.WebCar.Models;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "usr")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Column
    @Getter
    @Setter
    private String username;

    @Column
    @Getter
    @Setter
    private String password;

    @Column
    @Getter
    @Setter
    private boolean active;

    @Column
    @Getter
    @Setter
    private String name;

    @Column
    @Getter
    @Setter
    private String surname;

}