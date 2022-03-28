package com.globant.azservicebus.model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -4656934936684245771L;

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
