package com.arrisdev.studentservice.service;

import com.arrisdev.studentservice.model.Student;
import com.arrisdev.studentservice.vo.ResponseTemplateVO;

public interface IStudentService {

    Student saveStudent(Student student);
    ResponseTemplateVO getStudentWithDepartment(Long studentId);
}
