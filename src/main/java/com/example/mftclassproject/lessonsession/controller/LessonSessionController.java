package com.example.mftclassproject.lessonsession.controller;

import com.example.mftclassproject.classactivity.service.ClassActivityService;
import com.example.mftclassproject.lessonsession.model.entity.LessonSession;
import com.example.mftclassproject.lessonsession.service.LessonSessionService;
import com.example.mftclassproject.mftclass.service.MFTClassService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/LessonSessions")
public class LessonSessionController {

    private final LessonSessionService lessonSessionService;
    private final MFTClassService mftClassService;
    private final ClassActivityService classActivityService;


    public LessonSessionController(LessonSessionService lessonSessionService, MFTClassService mftClassService, ClassActivityService classActivityService) {
        this.lessonSessionService = lessonSessionService;
        this.mftClassService = mftClassService;
        this.classActivityService = classActivityService;
    }


    @GetMapping
    public String loadLessonSessions(Model model) {
        model.addAttribute("AllLessonSessions", lessonSessionService.findAll());
        model.addAttribute("AllMFTClass", mftClassService.findAll());
        model.addAttribute("AllClassActivity", classActivityService.findAll());
        return "lessonSessions";
    }

    public String saveLessonSession(LessonSession lessonSession, Model model, @ModelAttribute("sessionNumber") int sessionNumber ) {

        lessonSessionService.save(lessonSession);
        return "redirect:/lessonSessions";
    }
}
