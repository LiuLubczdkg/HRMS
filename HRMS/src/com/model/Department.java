package com.model;

import java.io.Serializable;

public class Department implements Serializable{
    private int id;
    private String name;
    private String cratertime;

    public Department() {
    }

    public Department(String name, String cratertime) {
        this.name = name;
        this.cratertime = cratertime;
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


    public String getCratertime() {
        return cratertime;
    }

    public void setCratertime(String cratertime) {
        this.cratertime = cratertime;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cratertime='" + cratertime + '\'' +
                '}';
    }
}
