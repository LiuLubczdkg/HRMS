package com.model;

import java.io.Serializable;

public class Interview implements Serializable{
    private int id;
    private Company company;
    private Guest guest;
    private String interviewtime;//����ʱ��
    private String interviewaddress;//���Ե���
    private Recruitment recruitment;
    private int gastatus;//��ְ�߶����ԵĻ�Ӧ
    private String result;

}
