package com.runners.cinema.dto;


import com.runners.cinema.model.Reservation;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class TicketDTO {

    private Long id;
    private Set<SeanceDTO> seance=new HashSet<>();

    private Double price;

    private KioskDTO kiosk;

    private ReservationDTO reservation;

    public TicketDTO() {
    }

    public TicketDTO(Long id, Set<SeanceDTO> seance, Double price, KioskDTO kiosk, ReservationDTO reservation) {
        this.id = id;
        this.seance = seance;
        this.price = price;
        this.kiosk = kiosk;
        this.reservation = reservation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<SeanceDTO> getSeance() {
        return seance;
    }

    public void setSeance(Set<SeanceDTO> seance) {
        this.seance = seance;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public KioskDTO getKiosk() {
        return kiosk;
    }

    public void setKiosk(KioskDTO kiosk) {
        this.kiosk = kiosk;
    }

    public ReservationDTO getReservation() {
        return reservation;
    }

    public void setReservation(ReservationDTO reservation) {
        this.reservation = reservation;
    }
}
