package com.model;

import java.io.Serializable;

public class Job implements Serializable {
    private int id;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", createtime='" + createtime + '\'' +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
