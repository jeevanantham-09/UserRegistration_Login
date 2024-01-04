package com.WebPageProject1.UserRegistration_Login.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public User() {
    }

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

    public User(String email, String password, String fullName, String role) {
        super();
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
    }

}