package com.model;

import java.io.Serializable;

public class Dempartment implements Serializable{
    private int id;
    private String name;
    private Company company;//ËùÊô¹«Ë¾
    private String cratertime;

    public Dempartment() {
    }

    public Dempartment(String name, Company company, String cratertime) {
        this.name = name;
        this.company = company;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getCratertime() {
        return cratertime;
    }

    public void setCratertime(String cratertime) {
        this.cratertime = cratertime;
    }

    @Override
    public String toString() {
        return "Dempartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company=" + company +
                ", cratertime='" + cratertime + '\'' +
                '}';
    }
}
