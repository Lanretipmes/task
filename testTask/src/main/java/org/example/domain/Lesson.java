package org.example.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String theme;
    @NonNull
    private Date lessonDate;
    private byte[] lectureFile;
    @NonNull
    private boolean isFinished;
    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lesson")
    private List<Question> questions;
    @OneToOne(fetch = FetchType.EAGER)
    private Teacher teacher;

}
