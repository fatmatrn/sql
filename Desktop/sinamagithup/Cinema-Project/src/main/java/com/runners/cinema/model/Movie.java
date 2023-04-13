package com.runners.cinema.model;

import com.runners.cinema.model.enums.Genre;
import com.runners.cinema.model.enums.ScreenTypeEnum;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_movie")
public class Movie{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    private String title;

    @NotBlank
    @NotNull
    private String director;


   // private Set<Genre> genre;//chat gbt nin onerisi?????????????????????????????????????????????????

   @Enumerated(EnumType.STRING)
   private Genre genre;

    @NotBlank
    @NotNull
    private Integer length;

    @NotBlank
    @NotNull
    private Integer minAge;

    @NotBlank
    @NotNull
    private String producer;

    @ManyToMany
    @JoinTable(name = "t_movie_screenroom",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "screenroom_id"))
    private Set<ScreeningRoom> screeningroom = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private ScreenTypeEnum screenTypeEnum;

    private boolean subtitle;

    @NotBlank
    @NotNull
    private String actors;

    @NotBlank
    @NotNull
    private String synopsis;

    private String trailerUrl; // Burada fragman vermişiz ama String dedik, neden? Çünkü fragmanı sitede video olarak vermemiz gerekiyor.
    // Burada iframe kullanabiliriz front end kısmında ama bilemedim yine de.

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "cinema_id")
    private Set<ImageFile> image;

    @NotBlank
    @NotNull
    private String country;

    private boolean builtIn = false;


    //GETTER  --  SETTER

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Set<ScreeningRoom> getScreeningroom() {
        return screeningroom;
    }

    public void setScreeningroom(Set<ScreeningRoom> screeningroom) {
        this.screeningroom = screeningroom;
    }

    public ScreenTypeEnum getScreenTypeEnum() {
        return screenTypeEnum;
    }

    public void setScreenTypeEnum(ScreenTypeEnum screenTypeEnum) {
        this.screenTypeEnum = screenTypeEnum;
    }

    public boolean isSubtitle() {
        return subtitle;
    }

    public void setSubtitle(boolean subtitle) {
        this.subtitle = subtitle;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    public Set<ImageFile> getImage() {
        return image;
    }

    public void setImage(Set<ImageFile> image) {
        this.image = image;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
    }

    //CONST..

    public Movie() {
    }

    public Movie(Long id, String title, String director, Genre genre, Integer length, Integer minAge, String producer, Set<ScreeningRoom> screeningroom, ScreenTypeEnum screenTypeEnum,
                 boolean subtitle, String actors, String synopsis, String trailerUrl, Set<ImageFile> image, String country) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.length = length;
        this.minAge = minAge;
        this.producer = producer;
        this.screeningroom = screeningroom;
        this.screenTypeEnum = screenTypeEnum;
        this.subtitle = subtitle;
        this.actors = actors;
        this.synopsis = synopsis;
        this.trailerUrl = trailerUrl;
        this.image = image;
        this.country = country;
    }

    //to String

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre=" + genre +
                ", length=" + length +
                ", minAge=" + minAge +
                ", producer='" + producer + '\'' +
                ", screeningroom=" + screeningroom +
                ", screenTypeEnum=" + screenTypeEnum +
                ", subtitle=" + subtitle +
                ", actors='" + actors + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", trailerUrl='" + trailerUrl + '\'' +
                ", image=" + image +
                ", country='" + country + '\'' +
                ", builtIn=" + builtIn +
                '}';
    }
}

