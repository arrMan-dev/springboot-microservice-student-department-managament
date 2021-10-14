package com.arrisdev.departmentservice.repository;

import com.arrisdev.departmentservice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findDepartmentByDepartmentId(Long departmentId);
}
