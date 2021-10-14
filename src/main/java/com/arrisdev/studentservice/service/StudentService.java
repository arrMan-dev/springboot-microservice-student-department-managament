package com.arrisdev.studentservice.service;

import com.arrisdev.studentservice.model.Student;
import com.arrisdev.studentservice.repository.StudentRepository;
import com.arrisdev.studentservice.vo.Department;
import com.arrisdev.studentservice.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class StudentService implements IStudentService{

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private RestTemplate restTemplate;

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        log.info("Saving student in student service: {}", student);
        return studentRepository.save(student);
    }

    @Override
    public ResponseTemplateVO getStudentWithDepartment(Long studentId) {
        log.info("Fecthing student with department: {}", studentId);
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Student std = studentRepository.findByStudentId(studentId);

        Department dpt = restTemplate.getForObject("http://DEPARTMENT-MS/api/department/get/" + std.getDepartmentId(), Department.class);

        vo.setStudent(std);
        vo.setDepartment(dpt);

        return vo;
    }
}
