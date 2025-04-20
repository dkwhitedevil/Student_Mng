package com.example.demo.Service;

import org.springframework.stereotype.Service;
import com.example.demo.Domain.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Save a student to the database
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
