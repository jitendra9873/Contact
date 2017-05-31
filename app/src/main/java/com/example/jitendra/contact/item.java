package com.example.jitendra.contact;

/**
 * Created by jitendra on 30/5/17.
 */

public class item {
    String name;
    int id;
    String number;

    public item(String name, String number, int id) {
        this.name = name;
        this.id = id;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
