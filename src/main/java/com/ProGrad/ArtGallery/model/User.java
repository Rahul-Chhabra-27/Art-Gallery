package com.ProGrad.ArtGallery.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="_user")
@Data
public class User {
    // Primary key of User Table
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    private String email;
    private String password;

    // No Argument Constructor..
    public User() {

    }
    // All Arguments Constructor..
    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}