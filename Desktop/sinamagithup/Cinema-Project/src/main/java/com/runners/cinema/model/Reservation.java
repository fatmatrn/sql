package com.runners.cinema.model;

import com.runners.cinema.model.enums.AudienceStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="t_reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToOne
    @JoinColumn(name = "ticket_id", referencedColumnName = "id")
    private Ticket ticket;

    @Column(nullable = false)
    private LocalDateTime reservationDate;

    @Enumerated(EnumType.STRING)
    @Column(length = 30, nullable = false)
    private AudienceStatus audienceStatus;

    @OneToMany
    @JoinColumn(name = "seats_id", referencedColumnName = "id")
    private Set<Seats> seats;

    @Column(length = 7, nullable = false)
    private String pnrNumber;

    @OneToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private Movie movie;

    @OneToOne
    @JoinColumn(name = "cinema_id", referencedColumnName = "id")
    private Cinema cinema;

    //construct

    public Reservation() {
    }

    public Reservation(Long id, User user, Ticket ticket, LocalDateTime reservationDate,
                       AudienceStatus audienceStatus, Set<Seats> seats, String pnrNumber, Movie movie, Cinema cinema) {
        this.id = id;
        this.user = user;
        this.ticket = ticket;
        this.reservationDate = reservationDate;
        this.audienceStatus = audienceStatus;
        this.seats = seats;
        this.pnrNumber = pnrNumber;
        this.movie = movie;
        this.cinema = cinema;
    }

//getter and setter

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public AudienceStatus getAudienceStatus() {
        return audienceStatus;
    }

    public void setAudienceStatus(AudienceStatus audienceStatus) {
        this.audienceStatus = audienceStatus;
    }

    public Set<Seats> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seats> seats) {
        this.seats = seats;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
}
