package com.runners.cinema.model;


import javax.persistence.*;

@Entity
@Table(name = "t_imageData")
public class ImageData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob  // Large Object -> Büyük objeleri DB'de tutacaksam
    private byte[] data;  // serialization

    public ImageData(byte[] data) {
        this.data = data;
    }

    public ImageData(Long id) {
        this.id = id;
    }


    // Constructor
    public ImageData() {
    }

    public ImageData(Long id, byte[] data) {
        this.id = id;
        this.data = data;
    }


    // Getter-Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}