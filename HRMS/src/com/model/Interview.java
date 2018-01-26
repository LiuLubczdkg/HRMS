package com.model;

import java.io.Serializable;

public class Interview implements Serializable{
    private int id;
    private Company company;
    private Guest guest;
    private String interviewtime;//面试时间
    private String interviewaddress;//面试地面
    private Recruitment recruitment;
    private int gastatus;//求职者对面试的回应
    private String result;

}
