package com.runners.cinema.dto;

import com.runners.cinema.model.enums.SeatType;

public class SeatsDTO {

    private Long id;

    private Integer seatNumber;

    private Integer rowNumber;

    private SeatType seatType;

    private boolean empty;


    public SeatsDTO(Long id, Integer seatNumber, Integer rowNumber, SeatType seatType, boolean empty) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.seatType = seatType;
        this.empty = empty;
    }

    public Long getId() {
        return id;
    }


    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }


}
