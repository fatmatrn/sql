package com.runners.cinema.dto;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class KioskDTO {


    private Long id;


    private Double smallMenuPrice;


    private Double mediumMenuPrice;


    private Double largeMenuPrice;


    private Integer smallMenuQuantity;


    private Integer mediumMenuQuantity;


    private Integer largeMenuQuantity;

    //@NotNull
    private Double totalMenuPrice;

    public KioskDTO() {
    }

    public KioskDTO(Long id, Double smallMenuPrice,
                    Double mediumMenuPrice,
                    Double largeMenuPrice,
                    Integer smallMenuQuantity,
                    Integer mediumMenuQuantity,
                    Integer largeMenuQuantity,
                    Double totalMenuPrice) {
        this.id = id;
        this.smallMenuPrice = smallMenuPrice;
        this.mediumMenuPrice = mediumMenuPrice;
        this.largeMenuPrice = largeMenuPrice;
        this.smallMenuQuantity = smallMenuQuantity;
        this.mediumMenuQuantity = mediumMenuQuantity;
        this.largeMenuQuantity = largeMenuQuantity;
        this.totalMenuPrice = totalMenuPrice;
    }

    public Long getId() {
        return id;
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