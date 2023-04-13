package com.runners.cinema.dto;

import com.runners.cinema.model.Seats;
import com.runners.cinema.model.enums.ScreenTypeEnum;

public class ScreeningRoomDTO {

    private Long id;

    private String name ;

    private Seats seat;

    private ScreenTypeEnum screenType;

    private boolean isOccupied;

    public ScreeningRoomDTO() {
    }

    public ScreeningRoomDTO(Long id, String name, Seats seat, ScreenTypeEnum screenType, boolean isOccupied) {
        this.id = id;
        this.name = name;
        this.seat = seat;
        this.screenType = screenType;
        this.isOccupied = isOccupied;
    }

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

    public Seats getSeat() {
        return seat;
    }










}
