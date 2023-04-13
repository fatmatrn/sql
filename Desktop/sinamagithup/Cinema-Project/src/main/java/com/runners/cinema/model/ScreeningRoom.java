package com.runners.cinema.model;

import com.runners.cinema.model.enums.Genre;
import com.runners.cinema.model.enums.ScreenTypeEnum;

import javax.persistence.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_screeningroom")
public class ScreeningRoom{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50,nullable = false)
    private String name;

    @OneToMany//bunu koymayinca hata verdi???????????????????????????????????
    private Set<Seats> seat;
    @Column(nullable = false)
    private boolean isOccupied;


   // private Set<Movie> movie=new HashSet<>();//bu field i kaldir mismiydik??????????????

//   @Enumerated(EnumType.STRING)//buraya bakilacak, enum hatasi veriyor??????????????
//    private Set<ScreenTypeEnum> screenTypeEnum=new HashSet<>();
//@Enumerated(EnumType.STRING)
//private Set<ScreenTypeEnum> screenTypeEnum = new HashSet<>(Arrays.asList(ScreenTypeEnum.SCREEN_TYPE_2D, ScreenTypeEnum.SCREEN_TYPE_3D,ScreenTypeEnum.SCREEN_TYPE_IMAX));



@Enumerated(EnumType.STRING)
private ScreenTypeEnum screenTypeEnum;


    public ScreeningRoom() {
    }

    public ScreeningRoom(long id, String name, Set<Seats> seat, boolean isOccupied, ScreenTypeEnum screenTypeEnum) {
        this.id = id;
        this.name = name;
        this.seat = seat;
        this.isOccupied = isOccupied;
        this.screenTypeEnum = screenTypeEnum;
    }

    public long getId() {
        return id;
    }

//        public void setId(long id) {
//            this.id = id;
//        }


    public ScreenTypeEnum getScreenTypeEnum() {
        return screenTypeEnum;
    }

    public void setScreenTypeEnum(ScreenTypeEnum screenTypeEnum) {
        this.screenTypeEnum = screenTypeEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

}