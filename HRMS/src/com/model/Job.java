package com.model;

import java.io.Serializable;

public class Job implements Serializable {
    private int j_id;
    private String createtime;//所在部门
    private String name;
    private Department department;//职业创建时间

    public Job() {
    }

    public Job(String createtime, String name, Department department) {
        this.createtime = createtime;
        this.name = name;
        this.department = department;
    }

    public int getJ_id() {
        return j_id;
    }

    public void setJ_id(int j_id) {
        this.j_id = j_id;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Job{" +
                "j_id=" + j_id +
                ", createtime='" + createtime + '\'' +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
