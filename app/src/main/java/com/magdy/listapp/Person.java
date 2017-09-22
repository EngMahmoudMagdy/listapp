package com.magdy.listapp;

import java.io.Serializable;

/**
 * Created by engma on 9/11/2017.
 */

public class Person implements Serializable {

    private String name ;
    private String number ;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
