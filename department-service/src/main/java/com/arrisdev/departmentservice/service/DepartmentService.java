package com.arrisdev.departmentservice.service;

import com.arrisdev.departmentservice.model.Department;
import com.arrisdev.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService implements IDepartmentService{

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department saveDepartment(Department department) {
        log.info("Saving department in the service : {}", department);
        return departmentRepository.save(department);
    }

    @Override
    public Department findDepartmentById(Long departmentId) {
        log.info("Fetching department by id from department service: {}", departmentId);
        return departmentRepository.findDepartmentByDepartmentId(departmentId);
    }
}
