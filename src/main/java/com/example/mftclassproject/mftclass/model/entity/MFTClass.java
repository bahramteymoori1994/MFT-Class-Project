package com.example.mftclassproject.mftclass.model.entity;

import com.example.mftclassproject.lesson.model.entity.Lesson;
import com.example.mftclassproject.lessonsession.model.entity.LessonSession;
import com.example.mftclassproject.student.model.entity.Student;
import com.example.mftclassproject.teacher.model.entity.Teacher;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name = "mftClassEntity")
@Table(name = "mft-class")
public class MFTClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "start_Date")
    private LocalDate startDate;

    @Column(name = "location")
    private String location;

    @Column(name = "day_of_week")
    @Enumerated(EnumType.ORDINAL)
    private DayOfWeek dayOfWeek;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "online_code")
    private int onlineCode;

    @Column(name = "in_person_code")
    private int inPersonCode;

    @Column(name = "type")
    private ClassType classType;

    @Column(name = "capacity")
    private int capacity;

    @ManyToOne
    @JoinColumn(name = "lesson_id", foreignKey = @ForeignKey(name = "fk_class_lesson"))
    private Lesson lesson;

    @ManyToMany(fetch = FetchType.EAGER)
    //    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "mftClasses")
    @JoinTable(
            name = "class_in_person_student_tbl",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"),
            foreignKey = @ForeignKey(name = "fk_class_in_person_student"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_class_in_person_student")
    )
    private List<Student> inPersonStudents;

    @ManyToMany(fetch = FetchType.EAGER)
//    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "mftClasses")
    @JoinTable(
            name = "class_online_student_tbl",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"),
            foreignKey = @ForeignKey(name = "fk_class_online_student"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_class_online_student")
    )
    private List<Student> onlineStudents;

    @ManyToOne
    @JoinColumn(name = "teacher_id", foreignKey = @ForeignKey(name = "fk_class_teacher"))
    private Teacher teacher;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST , CascadeType.MERGE})
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "mftClass", cascade = {CascadeType.PERSIST , CascadeType.MERGE})
    @JoinTable(name = "class_lesson_session_tbl",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "lesson_session_id"),
            foreignKey = @ForeignKey(name = "fk_class_lesson_session"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_class_lesson_session")
    )
    private List<LessonSession> lessonSessions;

    public void addLessonSession(LessonSession lessonSession) {
        if (this.lessonSessions == null) {
            this.lessonSessions = new ArrayList<>();
        }
        lessonSessions.add(lessonSession);
    }
}
