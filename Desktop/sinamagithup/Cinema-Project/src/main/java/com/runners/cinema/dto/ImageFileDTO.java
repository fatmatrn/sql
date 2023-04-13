package com.runners.cinema.dto;

public class ImageFileDTO {

    private String name;

    private String url;

    private long size;

    private String type;

    //Getter-Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Constructor

    public ImageFileDTO(String name, String url, long size, String type) {
        this.name = name;
        this.url = url;
        this.size = size;
        this.type = type;
    }

    public ImageFileDTO() {
    }
}