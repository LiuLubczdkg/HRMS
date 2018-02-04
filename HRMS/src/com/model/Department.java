package com.model;

import java.io.Serializable;

public class Department implements Serializable{
    private int d_id;
    private String name;
    private String cratertime;

    public Department() {
    }

    public Department(String name, String cratertime) {
        this.name = name;
        this.cratertime = cratertime;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCratertime() {
        return cratertime;
    }

    public void setCratertime(String cratertime) {
        this.cratertime = cratertime;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_id=" + d_id +
                ", name='" + name + '\'' +
                ", cratertime='" + cratertime + '\'' +
                '}';
    }
}
