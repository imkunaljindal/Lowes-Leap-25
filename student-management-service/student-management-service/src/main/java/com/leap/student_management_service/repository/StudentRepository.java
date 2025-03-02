package com.leap.student_management_service.repository;

import com.leap.student_management_service.model.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer, Student> studentDb = new HashMap<>();

    public void addStudent(Student student) {
        studentDb.put(student.getId(),student);
    }

    public Student getStudentById(int id) {
        if(!studentDb.containsKey(id)) {
            return null;
        }
        return studentDb.get(id);
    }
}
