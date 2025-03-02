package com.leap.student_management_service.service;

import com.leap.student_management_service.model.Student;
import com.leap.student_management_service.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student) {
        studentRepository.addStudent(student);
        return "Student has been added succesfully";
    }

    public Student getStudentById(int id) {
        return studentRepository.getStudentById(id);
    }
}
