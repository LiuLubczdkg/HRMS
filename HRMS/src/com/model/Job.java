package com.model;

import java.io.Serializable;

public class Job implements Serializable {
    private int id;
    private String createtime;//职业创建时间
    private Dempartment dempartment;//所在部门

    public Job() {
    }

    public Job(String createtime, Dempartment dempartment) {
        this.createtime = createtime;
        this.dempartment = dempartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Dempartment getDempartment() {
        return dempartment;
    }

    public void setDempartment(Dempartment dempartment) {
        this.dempartment = dempartment;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", createtime='" + createtime + '\'' +
                ", dempartment=" + dempartment +
                '}';
    }
}
