package com.model;

import java.io.Serializable;

public class Reward implements Serializable {
    private int re_id;//Ω±≥Õ
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

    public int getRe_id() {
        return re_id;
    }

    public void setRe_id(int re_id) {
        this.re_id = re_id;
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
                "re_id=" + re_id +
                ", employee=" + employee +
                ", money=" + money +
                ", time='" + time + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
