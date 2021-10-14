package com.arrisdev.departmentservice.service;

import com.arrisdev.departmentservice.model.Department;

public interface IDepartmentService {
    Department saveDepartment(Department department);
    Department findDepartmentById(Long departmentId);
}
