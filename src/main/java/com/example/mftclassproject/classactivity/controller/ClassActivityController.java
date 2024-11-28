package com.example.mftclassproject.classactivity.controller;


import com.example.mftclassproject.classactivity.model.entity.ClassActivity;
import com.example.mftclassproject.classactivity.service.ClassActivityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/classActivity")
public class ClassActivityController {
public final ClassActivityService classActivityService;
    public ClassActivityController(ClassActivityService classActivityService) {
        this.classActivityService = classActivityService;
    }
    @GetMapping
    public String loadClassActivity(Model model) {
        model.addAttribute("classActivity", new ClassActivity());
        model.addAttribute("classActivityList", classActivityService.findAll());
        return "classActivity";
    }

    @PostMapping
    public String save(Model model , ClassActivity classActivity) {
        classActivityService.save(classActivity);
        return "redirect:/classActivity";
    }



}