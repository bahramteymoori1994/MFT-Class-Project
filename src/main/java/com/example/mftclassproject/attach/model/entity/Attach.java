package com.example.mftclassproject.attach.model.entity;

import com.example.mftclassproject.attach.model.entity.enums.FileType;
import com.example.mftclassproject.classactivity.model.entity.ClassActivity;
import com.example.mftclassproject.lesson.model.entity.Lesson;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity(name = "attachEntity")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "attach")
public class Attach
{
    @Id
    @SequenceGenerator(name = "attachSeq", sequenceName = "attach_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attachSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "file_name", length = 50)
    private String fileName;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "file_type")
    private FileType fileType;

    @Column(name = "file_size")
    private Long fileSize;

    @Column(name = "attach_time")
    private LocalDateTime attachTime;

    @Column(name = "description", length = 50)
    private String description;

    @OneToOne
    @JoinColumn(name = "classactivity_id", foreignKey = @ForeignKey(name = "fk_class_activity"))
    private ClassActivity classActivity;

}