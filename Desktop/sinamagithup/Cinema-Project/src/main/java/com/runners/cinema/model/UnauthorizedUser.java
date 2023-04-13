package com.runners.cinema.model;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "t_unauthorizeduser")
public class UnauthorizedUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length =30, nullable = false )
    private String name;
    @Column(length =30, nullable = false )
    private String surname;
    @Column(length =80, nullable = false ,unique = true)
    private String email;
    @Column(length =14, nullable = false )
    private String phoneNumber;

    //cons.
    public UnauthorizedUser() {
    }

    public UnauthorizedUser(Long id, String name, String surname, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //get-set
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //toString
    @Override
    public String toString() {
        return "UnauthorizedUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
