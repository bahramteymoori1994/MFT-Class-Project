package com.example.mftclassproject.student.controller;

import com.example.mftclassproject.student.model.entity.Student;
import com.example.mftclassproject.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
@Slf4j

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String showForm(Model model)
    {
        model.addAttribute("student", new Student());
        model.addAttribute("studentList", studentService.findAll());
        return "student";
    }

    @PostMapping()
    public String saveStudent(Student student)
    {
        studentService.save(student);
        log.info("Student Saved...!");
        return "redirect:student";
    }

    @PutMapping()
    public String update(Student student)
    {
        studentService.update(student);
        log.info("Student Updated...!");
        return "redirect:student";
    }
}