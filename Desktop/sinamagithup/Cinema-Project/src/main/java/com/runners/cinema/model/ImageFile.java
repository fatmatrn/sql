package com.runners.cinema.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_imageFile")
public class ImageFile {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String name;

    private String type;

    private long length;

    @OneToOne(cascade = CascadeType.ALL)
    private ImageData imageData;


    public ImageFile(String name, String type, ImageData imageData) {
        this.name = name;
        this.type = type;
        this.imageData = imageData;
        this.length = imageData.getData().length;
    }


    // Constructor
    public ImageFile() {
    }

    public ImageFile(String id, String name, String type, long length, ImageData imageData) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.length = length;
        this.imageData = imageData;
    }


    // Getter-Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public ImageData getImageData() {
        return imageData;
    }

    public void setImageData(ImageData imageData) {
        this.imageData = imageData;
    }
}