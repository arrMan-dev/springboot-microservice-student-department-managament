package com.arrisdev.departmentservice.controller;

import com.arrisdev.departmentservice.model.Department;
import com.arrisdev.departmentservice.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/save/")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/get/{departmentid}")
    public Department findDepartmentByid(@PathVariable("departmentid") Long departmentId){
        return departmentService.findDepartmentById(departmentId);
    }
}
