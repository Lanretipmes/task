package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    @ManyToOne(fetch = FetchType.EAGER)
    private Student student;
    @NonNull
    private LocalDateTime answerDate;
    @NonNull
    @ManyToOne(fetch = FetchType.EAGER)
    private Question question;
    @NonNull
    @Column
    private String answerText;

}
