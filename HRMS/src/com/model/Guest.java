package com.model;

import java.io.Serializable;

public class Guest implements Serializable{
    private int id;
    private String name;
    private String password;
    private int applicationstatus;

    public Guest() {
    }

    public Guest(String name, String password, int applicationstatus) {
        this.name = name;
        this.password = password;
        this.applicationstatus = applicationstatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getApplicationstatus() {
        return applicationstatus;
    }

    public void setApplicationstatus(int applicationstatus) {
        this.applicationstatus = applicationstatus;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", applicationstatus=" + applicationstatus +
                '}';
    }
}
