package com.model;

import java.io.Serializable;

public class Interview implements Serializable{
    private int id;
    private Guest guest;
    private String interviewtime;//����ʱ��
    private String interviewaddress;//���Ե���
    private Recruitment recruitment;
    private int gastatus;//��ְ�߶����ԵĻ�Ӧ
    private String result;

    public Interview() {
    }

    public Interview(Guest guest, String interviewtime, String interviewaddress, Recruitment recruitment, int gastatus, String result) {
        this.guest = guest;
        this.interviewtime = interviewtime;
        this.interviewaddress = interviewaddress;
        this.recruitment = recruitment;
        this.gastatus = gastatus;
        this.result = result;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getInterviewtime() {
        return interviewtime;
    }

    public void setInterviewtime(String interviewtime) {
        this.interviewtime = interviewtime;
    }

    public String getInterviewaddress() {
        return interviewaddress;
    }

    public void setInterviewaddress(String interviewaddress) {
        this.interviewaddress = interviewaddress;
    }

    public Recruitment getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(Recruitment recruitment) {
        this.recruitment = recruitment;
    }

    public int getGastatus() {
        return gastatus;
    }

    public void setGastatus(int gastatus) {
        this.gastatus = gastatus;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "id=" + id +
                ", guest=" + guest +
                ", interviewtime='" + interviewtime + '\'' +
                ", interviewaddress='" + interviewaddress + '\'' +
                ", recruitment=" + recruitment +
                ", gastatus=" + gastatus +
                ", result='" + result + '\'' +
                '}';
    }
}
