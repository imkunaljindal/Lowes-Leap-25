package com.leap.student_management_service.controller;

import com.leap.student_management_service.model.Student;
import com.leap.student_management_service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    StudentService studentService1;

    @Autowired
    StudentService studentService2;

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        System.out.println(studentService2);
        System.out.println(studentService1);
       return studentService1.addStudent(student);
    }

    @GetMapping
    public Student getStudentById(@RequestParam("id") int id) {
        return studentService1.getStudentById(id);
    }

    @GetMapping("/id/{id}")
    public Student getStudentByIdOnPath(@PathVariable("id") int id) {
       return studentService1.getStudentById(id);
    }
}
