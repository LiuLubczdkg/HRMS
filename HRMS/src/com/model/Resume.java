package com.model;

import java.io.Serializable;

public class Resume implements Serializable{
    private int id;//简历
    private Guest guest;
    private String name;
    private int age;
    private String ethnicity;//民族
    private String phone;
    private String height;
    private String weight;
    private String marrige;//婚姻状态
    private String address;
    private String school;//毕业学校
    private String selfassessment;//自我评价
    private String intership;//实习经历
    private String award;//曾获奖励
    private Recruitment recruitment;//对应招聘表

    public Resume() {
    }

    public Resume(Guest guest, String name, int age, String ethnicity, String phone, String height, String weight, String marrige, String address, String school, String selfassessment, String intership, String award, Recruitment recruitment) {
        this.guest = guest;
        this.name = name;
        this.age = age;
        this.ethnicity = ethnicity;
        this.phone = phone;
        this.height = height;
        this.weight = weight;
        this.marrige = marrige;
        this.address = address;
        this.school = school;
        this.selfassessment = selfassessment;
        this.intership = intership;
        this.award = award;
        this.recruitment = recruitment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSelfassessment() {
        return selfassessment;
    }

    public void setSelfassessment(String selfassessment) {
        this.selfassessment = selfassessment;
    }

    public String getIntership() {
        return intership;
    }

    public void setIntership(String intership) {
        this.intership = intership;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Recruitment getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(Recruitment recruitment) {
        this.recruitment = recruitment;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", guest=" + guest +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ethnicity='" + ethnicity + '\'' +
                ", phone='" + phone + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", marrige='" + marrige + '\'' +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", selfassessment='" + selfassessment + '\'' +
                ", intership='" + intership + '\'' +
                ", award='" + award + '\'' +
                ", recruitment=" + recruitment +
                '}';
    }
}
