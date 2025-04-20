package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo.Domain.Student;
import com.example.demo.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StudentController
{
    @Autowired
    private StudentService serv;

    @GetMapping("/form")
    public String showform(Model model)
    {
        model.addAttribute("student", new Student());
        return "form";
    }
    
    @PostMapping("/submit")
    public String showsuccess(@ModelAttribute("student") Student student, Model model)
    {
        serv.saveStudent(student);
        model.addAttribute("message", "Student added successfully!");
        return "success";
    }

    @GetMapping("/list")
    public String listStudents(Model model) {
        model.addAttribute("students", serv.getAllStudents());
        return "list";
    }
    

}