package com.runners.cinema.dto;


public class PaymentDTO {

    private Long id;

    private String email;

    private String description;

    private ReservationDTO reservation;

    public PaymentDTO() {
    }

    public PaymentDTO(Long id, String email, String description, ReservationDTO reservation) {
        this.id = id;
        this.email = email;
        this.description = description;
        this.reservation = reservation;

    }

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

    public ReservationDTO getReservation() {
        return reservation;
    }

    public void setReservation(ReservationDTO reservation) {
        this.reservation = reservation;
    }

}

