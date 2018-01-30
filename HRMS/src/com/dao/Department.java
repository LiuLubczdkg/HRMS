package com.dao;

import java.util.List;

public interface Department {
    List<Department> AllDepartment();
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    boolean deleteDepartment(Department department);
}
