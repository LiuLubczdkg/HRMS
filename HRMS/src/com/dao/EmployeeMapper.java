package com.dao;

import com.model.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> AllEmp();
    Employee selectEmp(Employee employee);
    boolean addEmp(Employee employee);
    boolean updateEmp(Employee employee);
    boolean deleteEmp(Employee employee);
}
