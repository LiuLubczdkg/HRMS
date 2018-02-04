package com.model;

import java.io.Serializable;

public class Administer implements Serializable {
    private int a_id;
    private String name;
    private String pass;

    public Administer() {
    }

    public Administer(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }



    @Override
    public String toString() {
        return "Administer{" +
                "a_id=" + a_id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
