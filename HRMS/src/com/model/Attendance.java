package com.model;

import java.io.Serializable;

public class Attendance implements Serializable {
    private int id;
    private Employee employee;
    private String startime;//�ϰ��ʱ��
    private String endtime;//�°��ʱ��
    private String checkresult;//���ڽ��

    public Attendance() {
    }

    public Attendance(Employee employee, String startime, String endtime, String checkresult) {
        this.employee = employee;
        this.startime = startime;
        this.endtime = endtime;
        this.checkresult = checkresult;
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

    public String getStartime() {
        return startime;
    }

    public void setStartime(String startime) {
        this.startime = startime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", employee=" + employee +
                ", startime='" + startime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", checkresult='" + checkresult + '\'' +
                '}';
    }
}
