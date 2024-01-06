package com.WebPageProject1.UserRegistration_Login.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")
public class User {
    public User() {
    }

    public User(String email, String password, String fullName, String role) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
    }

    @Id
    private Long id;
    @Getter
    @Setter
    private String email;
    @Setter
    @Getter
    private String password;
    @Setter
    @Getter
    private String fullName;
    @Setter
    @Getter
    private String role;



}