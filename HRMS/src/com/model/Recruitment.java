package com.model;

import java.io.Serializable;

public class Recruitment implements Serializable{
    private int id;
    private Dempartment dempartment;
    private String jod;
    private int peopleneeded;//需要人数
    private String requirement;//职位需求
    private double money;
    private String workplace;

    public Recruitment() {
    }

    public Recruitment(Dempartment dempartment, String jod, int peopleneeded, String requirement, double money, String workplace) {
        this.dempartment = dempartment;
        this.jod = jod;
        this.peopleneeded = peopleneeded;
        this.requirement = requirement;
        this.money = money;
        this.workplace = workplace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dempartment getDempartment() {
        return dempartment;
    }

    public void setDempartment(Dempartment dempartment) {
        this.dempartment = dempartment;
    }

    public String getJod() {
        return jod;
    }

    public void setJod(String jod) {
        this.jod = jod;
    }

    public int getPeopleneeded() {
        return peopleneeded;
    }

    public void setPeopleneeded(int peopleneeded) {
        this.peopleneeded = peopleneeded;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }


    @Override
    public String toString() {
        return "Recruitment{" +
                "id=" + id +
                ", dempartment=" + dempartment +
                ", jod='" + jod + '\'' +
                ", peopleneeded=" + peopleneeded +
                ", requirement='" + requirement + '\'' +
                ", money=" + money +
                ", workplace='" + workplace + '\'' +
                '}';
    }
}
