package com.runners.cinema.dto;

import com.runners.cinema.model.ImageFile;
import com.runners.cinema.model.ScreeningRoom;
import com.runners.cinema.model.enums.Genre;
import com.runners.cinema.model.enums.ScreenTypeEnum;

import java.util.HashSet;
import java.util.Set;

public class MovieDTO {

    private Long id; // ID Yİ BİLEREK TUTTUM ÇÜNKÜ REPONSE DA GÖSTEREBİLİRİZ AMA REQUEST YAZARKEN ÇIKARTIRIZ DİYE DÜŞÜNDÜM

    private String title;

    private String director;

    private Set<Genre> genre;

    private Integer length;

    private Integer minAge;

    private String producer;

    private Set<ScreeningRoom> screeningroom = new HashSet<>();

    private ScreenTypeEnum screenTypeEnum;

    private boolean subtitle;

    private String actors;

    private String synopsis;

    private String trailerUrl;

    private Set<ImageFile> image;

    private String country;

    private boolean builtIn = false;


    //GETTER  --  SETTER

    public Long getId() {
        return id;
    }

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

    public Set<Genre> getGenre() {
        return genre;
    }

    public void setGenre(Set<Genre> genre) {
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

    public MovieDTO() {
    }

    public MovieDTO(Long id, String title, String director, Set<Genre> genre, Integer length, Integer minAge, String producer, Set<ScreeningRoom> screeningroom, ScreenTypeEnum screenTypeEnum, boolean subtitle, String actors, String synopsis, String trailerUrl, Set<ImageFile> image, String country, boolean builtIn) {
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
        this.builtIn = builtIn;
    }

    //to String
    // NOT : BURADA TO STRING E IHTIYAC VAR MI BİLEMEDİM? GENELDE İHTİYAÇ VAR MI ONDAN DA EMİN DEĞİLİM. KOMPLE ÇIKARTALIM MI?
    public String toString() {
        return "MovieDTO{" +
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
