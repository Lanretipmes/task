package org.example.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    List<Answer> answers;

}
