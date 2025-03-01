package com.leap.student_management_service;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> studentDb = new HashMap<>();

    @PostMapping("/student")
    public String addStudent(@RequestBody Student student) {
        studentDb.put(student.getId(),student);
        return "Student has been added succesfully";
    }

    @GetMapping("/student")
    public Student getStudentById(@RequestParam("id") int id) {
        if(!studentDb.containsKey(id)) {
            return null;
        }
        return studentDb.get(id);
    }

    @GetMapping("/student/id/{id}")
    public Student getStudentByIdOnPath(@PathVariable("id") int id) {
        if(!studentDb.containsKey(id)) {
            return null;
        }
        return studentDb.get(id);
    }
}
