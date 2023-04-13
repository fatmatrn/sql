package com.runners.cinema.dto;

import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.*;


public class CinemaDTO {

    private Long id;

    @Size(max = 50,message = "Size is exceeded")
    @NotBlank(message = "Please provide cinema name info")
    private String name;

    @Size(max = 150,message = "Size is exceeded")
    @NotBlank(message = "Please provide cinema address info")
    private String address;

    @Size(max = 250,message = "Size is exceeded")
    @NotBlank(message = "Please provide cinema location info")
    private String location;

    @Pattern(regexp = "^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$", //(541) 317-8828
            message = "Please provide valid phone number")
    @Size(min=14,max = 14)
    @NotBlank(message = "Please provide cinema phone number info")
    private String phoneNumber;

    private Set<MovieDTO> movies = new HashSet<>();  // ??????

        //Getter Setters

    public Long getId() {
        return id;
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

    public Set<MovieDTO> getMovies() {
        return movies;
    }

    public void setMovies(Set<MovieDTO> movies) {
        this.movies = movies;
    }

        // Constructors

    public CinemaDTO() {
    }

    public CinemaDTO(Long id, String name, String address, String location, String phoneNumber, Set<MovieDTO> movies) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.movies = movies;
    }
}
