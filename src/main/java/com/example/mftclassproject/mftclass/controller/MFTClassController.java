package com.example.mftclassproject.mftclass.controller;

import com.example.mftclassproject.lesson.model.entity.Lesson;
import com.example.mftclassproject.lesson.service.LessonService;
import com.example.mftclassproject.lessonsession.model.entity.LessonSession;
import com.example.mftclassproject.mftclass.model.entity.MFTClass;
import com.example.mftclassproject.mftclass.service.MFTClassService;
import com.example.mftclassproject.student.service.StudentService;
import com.example.mftclassproject.teacher.model.entity.Teacher;
import com.example.mftclassproject.teacher.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mftclasses")
public class MFTClassController {

    private final MFTClassService mftClassService;
    private final LessonService lessonService;
    private final StudentService studentService;
    private final TeacherService teacherService;

    public MFTClassController(MFTClassService mftClassService, LessonService lessonService, StudentService studentService, TeacherService teacherService) {
        this.mftClassService = mftClassService;
        this.lessonService = lessonService;
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    @GetMapping
    public String loadMFTClass(Model model) {
        model.addAttribute("allLessons", lessonService.findAll());
        model.addAttribute("allTeachers", teacherService.findAll());
        model.addAttribute("allStudents", studentService.findAll());
        model.addAttribute("mftClasses", mftClassService.findAll());
        model.addAttribute("mftClass", new MFTClass());
        return "mftclass";
    }

    @PostMapping
    public String saveMFTClass(
            MFTClass mftClass,
            Model model,
            @ModelAttribute("lesson") Long lessonId,
            @ModelAttribute("teacher") Long teacherId,
            @ModelAttribute("sessionNumber") int sessionNumber
    ) {

        Lesson lesson = lessonService.findById(lessonId);
        Teacher teacher = teacherService.findById(teacherId);

        mftClass.setLesson(lesson);
        mftClass.setTeacher(teacher);

        for (int i=0; i<sessionNumber; i++){
            LessonSession lessonSession = new LessonSession();
            mftClass.addLessonSession(lessonSession);
        }
        mftClassService.save(mftClass);
        return "redirect:/mftclasses";
    }

    @DeleteMapping(path = "/{id}")
    public String deleteMFTClass(@PathVariable Long id) {
        mftClassService.delete(id);
        return "redirect:/mftclasses";
    }
}
