package com.bridgelabz.springsecurityjwt.entity;


import lombok.Data;
import lombok.extern.java.Log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    private String email;

    private String password;

    private String role;

    private boolean enabled;

}
