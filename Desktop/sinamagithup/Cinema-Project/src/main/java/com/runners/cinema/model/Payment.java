package com.runners.cinema.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "t_payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(length = 80,nullable = false,unique = true)
    private String email;

    @Column(length = 200,nullable = false)
    private String description;

    @OneToOne
    @JoinColumn(name="reservation_id", referencedColumnName = "id")
    private Reservation reservation;

    //Cons.
    public Payment() {
    }

    public Payment(Long id, String email, String description, Reservation reservation) {
        this.id = id;
        this.email = email;
        this.description = description;
        this.reservation = reservation;
    }


    //Getter-Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
