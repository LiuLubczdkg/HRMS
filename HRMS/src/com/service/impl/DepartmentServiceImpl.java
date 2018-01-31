package com.service.impl;

import com.dao.DepartmentMapper;
import com.model.Department;
import com.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService{
    @Resource
    private DepartmentMapper departmentMapper;

    public DepartmentServiceImpl() {
    }

    @Override
    public List<Department> AllDepartment() {
        return departmentMapper.AllDepartment();
    }

    @Override
    public Department selectDepartment(Department department) {
        return departmentMapper.selectDepartment(department);
    }

    @Override
    public boolean addDepartment(Department department) {
        return departmentMapper.addDepartment(department);
    }

    @Override
    public boolean updateDepartment(Department department) {
        return departmentMapper.updateDepartment(department);
    }

    @Override
    public boolean deleteDepartment(Department department) {
        return departmentMapper.deleteDepartment(department);
    }
}
