package com.runners.cinema.dto;

import java.time.LocalDateTime;
import java.util.Set;

public class ReservationDTO {

    private Long id;

    private Long userId;

    private Long tickedId;

    private LocalDateTime reservationDate;

    //private AudienceStatus audienceStatus;

    private Set<Long> seat;

    private String pnrNumber;

    private Long movieId;

    private Long cinemaId;

    //construct


    public ReservationDTO(Long id, Long userId, Long tickedId, LocalDateTime reservationDate, Set<Long> seat, String pnrNumber, Long movieId, Long cinemaId) {
        this.id = id;
        this.userId = userId;
        this.tickedId = tickedId;
        this.reservationDate = reservationDate;
       // this.audienceStatus = audienceStatus;
        this.seat = seat;
        this.pnrNumber = pnrNumber;
        this.movieId = movieId;
        this.cinemaId = cinemaId;
    }

    public ReservationDTO() {
    }

    //Getter and Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTickedId() {
        return tickedId;
    }

    public void setTickedId(Long tickedId) {
        this.tickedId = tickedId;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

//    public AudienceStatus getAudienceStatus() {
//        return audienceStatus;
//    }
//
//    public void setAudienceStatus(AudienceStatus audienceStatus) {
//        this.audienceStatus = audienceStatus;
//    }

    public Set<Long> getSeat() {
        return seat;
    }

    public void setSeat(Set<Long> seat) {
        this.seat = seat;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
    }
}
