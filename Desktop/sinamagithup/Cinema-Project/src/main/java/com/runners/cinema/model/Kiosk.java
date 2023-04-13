package com.runners.cinema.model;

import javax.persistence.*;

@Entity
@Table(name = "t_kiosk")
public class Kiosk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(nullable = false)
    private Double smallMenuPrice;

    //@Column(nullable = false)
    private Double mediumMenuPrice;

    //@Column(nullable = false)
    private Double largeMenuPrice;

    //@Column(nullable = false)
    private Integer smallMenuQuantity;

    //@Column(nullable = false)
    private Integer mediumMenuQuantity;

    //@Column(nullable = false)
    private Integer largeMenuQuantity;

    @Column(nullable = false)
    private Double totalMenuPrice;

    //Cons.
    public Kiosk() {
    }

    public Kiosk(Long id, Double smallMenuPrice,
                 Double mediumMenuPrice, Double largeMenuPrice,
                 Integer smallMenuQuantity, Integer mediumMenuQuantity,
                 Integer largeMenuQuantity, Double totalMenuPrice) {
        this.id = id;
        this.smallMenuPrice = smallMenuPrice;
        this.mediumMenuPrice = mediumMenuPrice;
        this.largeMenuPrice = largeMenuPrice;
        this.smallMenuQuantity = smallMenuQuantity;
        this.mediumMenuQuantity = mediumMenuQuantity;
        this.largeMenuQuantity = largeMenuQuantity;
        this.totalMenuPrice = totalMenuPrice;
    }

    //Getter-Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSmallMenuPrice() {
        return smallMenuPrice;
    }

    public void setSmallMenuPrice(Double smallMenuPrice) {
        this.smallMenuPrice = smallMenuPrice;
    }

    public Double getMediumMenuPrice() {
        return mediumMenuPrice;
    }

    public void setMediumMenuPrice(Double mediumMenuPrice) {
        this.mediumMenuPrice = mediumMenuPrice;
    }

    public Double getLargeMenuPrice() {
        return largeMenuPrice;
    }

    public void setLargeMenuPrice(Double largeMenuPrice) {
        this.largeMenuPrice = largeMenuPrice;
    }

    public Integer getSmallMenuQuantity() {
        return smallMenuQuantity;
    }

    public void setSmallMenuQuantity(Integer smallMenuQuantity) {
        this.smallMenuQuantity = smallMenuQuantity;
    }

    public Integer getMediumMenuQuantity() {
        return mediumMenuQuantity;
    }

    public void setMediumMenuQuantity(Integer mediumMenuQuantity) {
        this.mediumMenuQuantity = mediumMenuQuantity;
    }

    public Integer getLargeMenuQuantity() {
        return largeMenuQuantity;
    }

    public void setLargeMenuQuantity(Integer largeMenuQuantity) {
        this.largeMenuQuantity = largeMenuQuantity;
    }

    public Double getTotalMenuPrice() {
        return totalMenuPrice;
    }

    public void setTotalMenuPrice(Double totalMenuPrice) {
        this.totalMenuPrice = totalMenuPrice;
    }
}
