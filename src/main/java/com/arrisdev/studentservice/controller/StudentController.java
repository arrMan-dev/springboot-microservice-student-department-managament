package com.arrisdev.studentservice.controller;

import com.arrisdev.studentservice.model.Student;
import com.arrisdev.studentservice.service.StudentService;
import com.arrisdev.studentservice.vo.ResponseTemplateVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save/")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/get/{studentid}")
    public ResponseTemplateVO getStudentWithDepartment(@PathVariable("studentid") Long studentId){
        return studentService.getStudentWithDepartment(studentId);
    }
}
