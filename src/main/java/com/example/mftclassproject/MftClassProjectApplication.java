package com.example.mftclassproject;

import com.example.mftclassproject.lesson.model.entity.Lesson;
import com.example.mftclassproject.lesson.service.LessonService;
import com.example.mftclassproject.mftclass.model.entity.ClassType;
import com.example.mftclassproject.mftclass.model.entity.MFTClass;
import com.example.mftclassproject.mftclass.service.impl.MFTClassService;
import com.example.mftclassproject.student.model.entity.Student;
import com.example.mftclassproject.student.service.StudentService;
import com.example.mftclassproject.teacher.model.entity.Teacher;
import com.example.mftclassproject.teacher.service.TeacherService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class MftClassProjectApplication {

    private static LessonService lessonService;
    private static StudentService studentService;
    private static TeacherService teacherService;
    private static MFTClassService mftClassService;

    public MftClassProjectApplication(LessonService lessonService, StudentService studentService, TeacherService teacherService, MFTClassService mftClassService) {
        MftClassProjectApplication.lessonService = lessonService;
        MftClassProjectApplication.studentService = studentService;
        MftClassProjectApplication.teacherService = teacherService;
        MftClassProjectApplication.mftClassService = mftClassService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MftClassProjectApplication.class, args);

        Lesson lesson =
                Lesson
                        .builder()
                        .title("JAVA SE")
                        .build();

        lessonService.save(lesson);

        Lesson lesson1 =
                Lesson
                        .builder()
                        .title("JAVA EE")
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
                        .family("SADEGHI")
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
                        .family("KAMALI")
                        .username("sina123")
                        .password("1213456")
                        .email("sina@gmail.com")
                        .address("Tehran")
                        .nationalCode("0070562233")
                        .phoneNumber("09128886644")
                        .build();

        teacherService.save(teacher1);

        MFTClass mftClass =
                MFTClass
                        .builder()
                        .lesson(lesson)
                        .teacher(teacher)
                        .classType(ClassType.BLENDED)
                        .startDate(LocalDate.now())
                        .location("sadeghiyeh")
                        .dayOfWeek(DayOfWeek.SUNDAY)
                        .startTime(LocalTime.of(8,30))
                        .endTime(LocalTime.of(11,30))
                        .onlineStudents(null)
                        .inPersonStudents(null)
                        .lessonSessions(null)
                        .onlineCode(12)
                        .inPersonCode(120)
                        .capacity(14)
                        .build();

        mftClassService.save(mftClass);

        System.out.println(mftClassService.findByLessonTitle("ja"));
        System.out.println(mftClassService.findByLessonTitle("HTML"));
        System.out.println(mftClassService.findByLessonTitle("JAVA"));

    }

}
