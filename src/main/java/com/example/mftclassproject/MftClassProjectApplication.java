package com.example.mftclassproject;

import com.example.mftclassproject.lesson.model.entity.Lesson;
import com.example.mftclassproject.lesson.service.LessonService;
import com.example.mftclassproject.student.model.entity.Student;
import com.example.mftclassproject.student.service.StudentService;
import com.example.mftclassproject.teacher.model.entity.Teacher;
import com.example.mftclassproject.teacher.service.TeacherService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MftClassProjectApplication {

    private static LessonService lessonService;
    private static StudentService studentService;
    private static TeacherService teacherService;

    public MftClassProjectApplication(LessonService lessonService, StudentService studentService, TeacherService teacherService) {
        MftClassProjectApplication.lessonService = lessonService;
        MftClassProjectApplication.studentService = studentService;
        MftClassProjectApplication.teacherService = teacherService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MftClassProjectApplication.class, args);

        Lesson lesson =
                Lesson
                        .builder()
                        .title("Java SE")
                        .build();

        lessonService.save(lesson);

        Lesson lesson1 =
                Lesson
                        .builder()
                        .title("Java EE")
                        .build();

        lessonService.save(lesson1);

        Lesson lesson2 =
                Lesson
                        .builder()
                        .title("HTML")
                        .build();

        lessonService.save(lesson2);

        Student student =
                Student
                        .builder()
                        .name("ali")
                        .family("alipour")
                        .username("ali123")
                        .password("1213456")
                        .email("ali@gmail.com")
                        .address("Tehran")
                        .nationalCode("0079854411")
                        .phoneNumber("09124445566")
                        .build();

        studentService.save(student);

        Student student1 =
                Student
                        .builder()
                        .name("reza")
                        .family("rezai")
                        .username("reza123")
                        .password("1213456")
                        .email("reza@gmail.com")
                        .address("Tehran")
                        .nationalCode("0079635252")
                        .phoneNumber("09123332211")
                        .build();

        studentService.save(student1);

        Student student2 =
                Student
                        .builder()
                        .name("mohsen")
                        .family("akbari")
                        .username("mohsen123")
                        .password("1213456")
                        .email("mohsen@gmail.com")
                        .address("Tehran")
                        .nationalCode("0071475896")
                        .phoneNumber("09129998877")
                        .build();

        studentService.save(student2);

        Teacher teacher =
                Teacher
                        .builder()
                        .name("navid")
                        .family("sadeghi")
                        .username("navid123")
                        .password("1213456")
                        .email("navid@gmail.com")
                        .address("Tehran")
                        .nationalCode("0075603310")
                        .phoneNumber("09124447711")
                        .build();

        teacherService.save(teacher);

        Teacher teacher1 =
                Teacher
                        .builder()
                        .name("sina")
                        .family("kamali")
                        .username("sina123")
                        .password("1213456")
                        .email("sina@gmail.com")
                        .address("Tehran")
                        .nationalCode("0070562233")
                        .phoneNumber("09128886644")
                        .build();

        teacherService.save(teacher1);


    }

}
