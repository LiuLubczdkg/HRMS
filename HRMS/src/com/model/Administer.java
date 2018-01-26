package com.model;

import java.io.Serializable;

public class Administer implements Serializable {
    private int id;
    private String name;
    private String pass;
    private Company company;

    public Administer() {
    }

    public Administer(String name, String pass, Company company) {
        this.name = name;
        this.pass = pass;
        this.company = company;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Administer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", company=" + company +
                '}';
    }
}
