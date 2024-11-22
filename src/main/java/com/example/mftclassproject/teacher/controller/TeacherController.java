package com.example.mftclassproject.teacher.controller;

import com.example.mftclassproject.teacher.model.entity.Teacher;
import com.example.mftclassproject.teacher.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/teacher")
@Slf4j

public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping
    public String showForm(Model model)
    {
        model.addAttribute("teacher", new Teacher());
        model.addAttribute("teacherList", teacherService.findAll());
        return "teacher";
    }

    @PostMapping()
    public String saveTeacher(Teacher teacher)
    {
        teacherService.save(teacher);
        log.info("Teacher Saved...!");
        return "redirect:teacher";
    }

    @PutMapping()
    public String update(Teacher teacher)
    {
        teacherService.update(teacher);
        log.info("Teacher Updated...!");
        return "redirect:teacher";
    }
}