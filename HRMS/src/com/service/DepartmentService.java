package com.service;

import com.dao.DepartmentMapper;
import com.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> AllDepartment();
    Department selectDepartment(Department department);
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    boolean deleteDepartment(Department department);
}
