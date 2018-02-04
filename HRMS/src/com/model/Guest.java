package com.model;

import java.io.Serializable;

public class Guest implements Serializable{
    private int g_id;
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

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
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
                "g_id=" + g_id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", applicationstatus=" + applicationstatus +
                '}';
    }
}
