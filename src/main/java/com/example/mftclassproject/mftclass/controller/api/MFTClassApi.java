package com.example.mftclassproject.mftclass.controller.api;


import com.example.mftclassproject.mftclass.model.enums.ClassType;
import com.example.mftclassproject.mftclass.service.MFTClassService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MFTClassApi {
    private final MFTClassService mftClassService;

    public MFTClassApi(MFTClassService mftClassService) {
        this.mftClassService = mftClassService;
    }

    @GetMapping(path = "/mftclasses/findByLessonName/{lessonName}")
    public ResponseEntity<?> findByLessonName(@PathVariable String lessonName) {
        Object result = mftClassService.findByLessonTitle(lessonName);
        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.status(404)
                    .body("No records found for title: " + lessonName);
        }
    }



    @GetMapping(path = "/mftclasses/findByTeacherFamily/{teacherFamily}")
    public ResponseEntity<?> findByTeacherFamily(@PathVariable String teacherFamily) {
        Object result = mftClassService.findByTeacherFamily(teacherFamily);
        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.status(404)
                    .body("No records found for this teacher: " + teacherFamily);
        }
    }


    @GetMapping(path = "/mftclasses/findByType/{classType}")
    public ResponseEntity<?> findByClassType(@PathVariable ClassType classType) {

        Object result = mftClassService.findByClassType(classType);
        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.status(404)
                    .body("No records found for this type: " + classType);
        }
    }


    @GetMapping(path = "/mftclasses/findByLocation/{location}")
    public ResponseEntity<?> findByLocation(@PathVariable String location) {
        Object result = mftClassService.findByLocation(location);
        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.status(404)
                    .body("No records found for this location: " + location);
        }
    }

}
