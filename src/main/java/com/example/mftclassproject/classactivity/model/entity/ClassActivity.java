package com.example.mftclassproject.classactivity.model.entity;

import com.example.mftclassproject.lessonsession.model.entity.LessonSession;
import com.example.mftclassproject.mftclass.model.entity.ClassType;
import com.example.mftclassproject.student.model.entity.Student;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity(name = "classActivityEntity")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "class-activity")
public class ClassActivity
{
    @Id
    @SequenceGenerator(name = "class_activity_seq", sequenceName = "class_activity_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "class_activity_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private ClassType classType;

    @Column(name = "score")
    private int score;

    @Column(name = "present_type")
    private ClassType presentType;

    @ManyToOne
    @JoinColumn(name = "lesson_session_id", foreignKey = @ForeignKey(name = "fk_lesson_session"))
    private LessonSession lessonSession;


    @ManyToOne
    @JoinColumn(name = "student_id", foreignKey = @ForeignKey(name = "fk_student"))
    private Student student;




}