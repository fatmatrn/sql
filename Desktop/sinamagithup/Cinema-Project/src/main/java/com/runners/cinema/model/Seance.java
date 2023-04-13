package com.runners.cinema.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_seance")
public class Seance{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private LocalTime time;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private boolean isAvailable;


    @ManyToMany
    @JoinTable( name = "t_seance_screeningroom",
            joinColumns = @JoinColumn(name = "seance_id"),
            inverseJoinColumns = @JoinColumn(name = "screeningroom_id"))
    private Set<ScreeningRoom> screeningRoom =new HashSet<>();

    public Seance() {
    }

    public Seance(long id, LocalTime time, LocalDate date, boolean isAvailable, Set<ScreeningRoom> screeningRoom) {
        this.id = id;
        this.time = time;
        this.date = date;
        this.isAvailable = isAvailable;
        this.screeningRoom = screeningRoom;
    }

    // Getter setter


    public long getId() {
        return id;
    }

//        public void setId(long id) {
//            this.id = id;
//        }

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

    public Set<ScreeningRoom> getScreeningRoom() {
        return screeningRoom;
    }

    public void setScreeningRoom(Set<ScreeningRoom> screeningRoom) {
        this.screeningRoom = screeningRoom;
    }
}
