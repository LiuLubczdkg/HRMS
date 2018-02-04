package com.model;


import java.io.Serializable;

public class Train implements Serializable {
    private int t_id;
    private Employee employee;
    private String time;//≈‡—µ ±º‰
    private String address;//≈‡—µµÿ÷∑
    private String train;//≈‡—µƒ⁄»›

    public Train() {
    }

    public Train(Employee employee, String time, String address, String train) {
        this.employee = employee;
        this.time = time;
        this.address = address;
        this.train = train;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Train{" +
                "t_id=" + t_id +
                ", employee=" + employee +
                ", time='" + time + '\'' +
                ", address='" + address + '\'' +
                ", train='" + train + '\'' +
                '}';
    }
}
