package com.runners.cinema.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_cinema")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50,nullable = false)
    private String name;

    @Column(length = 150,nullable = false)
    private String address;

    @Column(length = 250,nullable = false)
    private String location;

    @Column(length = 20,nullable = false)
    private String phoneNumber;

    @ManyToMany
    @JoinTable(name = "t_cinema_movie",joinColumns = @JoinColumn(name = "cinema_id"),inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private Set<Movie> movies = new HashSet<>();

        //Getters - Setters

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

        //Constructors

    public Cinema() {
    }

    public Cinema(Long id, String name, String address, String location, String phoneNumber, Set<Movie> movies) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.movies = movies;
    }

        // ToString

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", movies=" + movies +
                '}';
    }
}
