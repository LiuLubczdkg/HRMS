package com.model;

import java.io.Serializable;

public class Job implements Serializable {
    private int id;
    private String createtime;//���ڲ���
    private String name;
    private Dempartment dempartment;//ְҵ����ʱ��

    public Job() {
    }

    public Job(String createtime, String name, Dempartment dempartment) {
        this.createtime = createtime;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", name='" + name + '\'' +
                ", dempartment=" + dempartment +
                '}';
    }
}
