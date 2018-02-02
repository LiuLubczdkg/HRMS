package com.service;

import com.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> AllEmp();
    Employee selectEmp(Employee employee);
    boolean addEmp(Employee employee);
    boolean updateEmp(Employee employee);
    boolean deleteEmp(Employee employee);
}
