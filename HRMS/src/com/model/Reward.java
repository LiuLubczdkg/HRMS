package com.model;

import java.io.Serializable;

public class Reward implements Serializable {
    private int id;//Ω±≥Õ
    private Employee employee;
    private double money;
    private String time;
    private String reason;//Ω±≥Õ¿Ì”…

    public Reward() {
    }

    public Reward(Employee employee, double money, String time, String reason) {
        this.employee = employee;
        this.money = money;
        this.time = time;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Reward{" +
                "id=" + id +
                ", employee=" + employee +
                ", money=" + money +
                ", time='" + time + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
