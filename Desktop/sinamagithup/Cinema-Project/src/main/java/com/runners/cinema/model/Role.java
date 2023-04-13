package com.runners.cinema.model;

import com.runners.cinema.model.enums.RoleType;


import javax.persistence.*;
@Entity
@Table(name = "t_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private RoleType type;

    // GETTER - SETTER
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoleType getType() {
        return type;
    }

    public void setType(RoleType type) {
        this.type = type;
    }

    // NO CONST - ALL CONST
    public Role() {
    }

    public Role(Integer id, RoleType type) {
        this.id = id;
        this.type = type;
    }

    //toSTRING
    @Override
    public String toString() {
        return "Roless{" +
                "type=" + type +
                '}';
    }
}
