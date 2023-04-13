package com.runners.cinema.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class SeanceDTO {


    private long id;


    private LocalTime time;


    private LocalDate date;


    private boolean isAvailable;




    private Set<String> screeningRoom;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Set<String> getScreeningRoom() {
        return screeningRoom;
    }
//    public void setRoles(Set<ScreeningRoom> screeningRoom) {
//        Set<String> screeningRoomName = new HashSet<>();
//        screeningRoom.forEach(r->{
//            screeningRoomName.add(r.getType().getName());
//        });
//        this.screeningRoom=screeningRoomName;
//    }
}
