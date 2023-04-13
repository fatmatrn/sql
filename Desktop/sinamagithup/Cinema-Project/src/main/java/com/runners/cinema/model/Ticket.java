package com.runners.cinema.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "t_ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinTable(name = "t_ticket_seance", joinColumns = @JoinColumn(name="ticket_id"), inverseJoinColumns=@JoinColumn(name = "seance_id"))
    private Set<Seance> seance=new HashSet<>();
    @Column(length = 10,nullable = false)
    private Double price;
    @OneToOne
    @JoinColumn(name = "kiosk_id")
    private Kiosk kiosk;
    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    public Long getId() {
        return id;
    }
    //    public void setId(Long id) {
//        this.id = id;
//    }
    public Set<Seance> getSeance() {
        return seance;
    }
    public void setSeance(Set<Seance> seance) {
        this.seance = seance;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Kiosk getKiosk() {
        return kiosk;
    }
    public void setKiosk(Kiosk kiosk) {
        this.kiosk = kiosk;
    }
    public Ticket() {
    }
    public Ticket(Long id, Set<Seance> seance, Double price, Kiosk kiosk, Reservation reservation) {
        this.id = id;
        this.seance = seance;
        this.price = price;
        this.kiosk = kiosk;
        this.reservation = reservation;
    }
}
