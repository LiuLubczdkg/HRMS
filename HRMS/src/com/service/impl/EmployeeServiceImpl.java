package com.service.impl;

import com.dao.EmployeeMapper;
import com.model.Employee;
import com.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> AllEmp() {
        return employeeMapper.AllEmp();
    }

    @Override
    public Employee selectEmp(Employee employee) {
        return employeeMapper.selectEmp(employee);
    }

    @Override
    public boolean addEmp(Employee employee) {
        return employeeMapper.addEmp(employee);
    }

    @Override
    public boolean updateEmp(Employee employee) {
        return employeeMapper.updateEmp(employee);
    }

    @Override
    public boolean deleteEmp(Employee employee) {
        return employeeMapper.deleteEmp(employee);
    }
}
