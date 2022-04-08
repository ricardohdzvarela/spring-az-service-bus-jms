package com.globant.azservicebus.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
public class User /*implements Serializable */{

    //private static final long serialVersionUID = -4656934936684245771L;

    private String name;
    private int edad;

    public User() {
    }

    public User(String name) {
        this.name = name;
        this.edad = 30;
    }
}
