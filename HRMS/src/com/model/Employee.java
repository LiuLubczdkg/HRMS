package com.model;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    private String pass;
    private String realname;//真实姓名
    private int age;
    private String ethnicity;//民族
    private String phone;
    private String marrige;//婚姻状态
    private String address;
    private String hiretime;//入职时间
    private Department dempartment;//部门
    private Job job;
    private double basicwage;//基本工资
    private String workstarttime;//上班时间
    private String workendtime;//下班时间
    private int workstatus;//员工状态 离职  试用 在职

    public Employee() {
    }

    public Employee(String name, String pass, String realname, int age, String ethnicity, String phone, String marrige, String address, String hiretime, Department dempartment, Job job, double basicwage, String workstarttime, String workendtime, int workstatus) {
        this.name = name;
        this.pass = pass;
        this.realname = realname;
        this.age = age;
        this.ethnicity = ethnicity;
        this.phone = phone;
        this.marrige = marrige;
        this.address = address;
        this.hiretime = hiretime;
        this.dempartment = dempartment;
        this.job = job;
        this.basicwage = basicwage;
        this.workstarttime = workstarttime;
        this.workendtime = workendtime;
        this.workstatus = workstatus;
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMarrige() {
        return marrige;
    }

    public void setMarrige(String marrige) {
        this.marrige = marrige;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHiretime() {
        return hiretime;
    }

    public void setHiretime(String hiretime) {
        this.hiretime = hiretime;
    }


    public Department getDempartment() {
        return dempartment;
    }

    public void setDempartment(Department dempartment) {
        this.dempartment = dempartment;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public double getBasicwage() {
        return basicwage;
    }

    public void setBasicwage(double basicwage) {
        this.basicwage = basicwage;
    }

    public String getWorkstarttime() {
        return workstarttime;
    }

    public void setWorkstarttime(String workstarttime) {
        this.workstarttime = workstarttime;
    }

    public String getWorkendtime() {
        return workendtime;
    }

    public void setWorkendtime(String workendtime) {
        this.workendtime = workendtime;
    }

    public int getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(int workstatus) {
        this.workstatus = workstatus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", realname='" + realname + '\'' +
                ", age=" + age +
                ", ethnicity='" + ethnicity + '\'' +
                ", phone='" + phone + '\'' +
                ", marrige='" + marrige + '\'' +
                ", address='" + address + '\'' +
                ", hiretime='" + hiretime + '\'' +
                ", dempartment=" + dempartment +
                ", job=" + job +
                ", basicwage=" + basicwage +
                ", workstarttime='" + workstarttime + '\'' +
                ", workendtime='" + workendtime + '\'' +
                ", workstatus=" + workstatus +
                '}';
    }
}
