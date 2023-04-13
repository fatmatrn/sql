package com.runners.cinema.model.enums;

public enum RoleType {
    ROLE_ADMIN ("Adminastrator"),
    ROLE_CUSTOMER ("Customer");

    private String name;

    private RoleType(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

