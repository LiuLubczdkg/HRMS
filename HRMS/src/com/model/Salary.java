package com.model;

import java.io.Serializable;

public class Salary implements Serializable{
    private int s_id;
    private Employee employee;
    private double bonus;//奖金
    private String date;//薪资对应时间
    private int status;//员工确认结果

    public Salary() {
    }

    public Salary(Employee employee, double bonus, String date, int status) {
        this.employee = employee;
        this.bonus = bonus;
        this.date = date;
        this.status = status;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "s_id=" + s_id +
                ", employee=" + employee +
                ", bonus=" + bonus +
                ", date='" + date + '\'' +
                ", status=" + status +
                '}';
    }
}
