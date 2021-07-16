package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@MappedSuperclass
public class Person {

    private String fName;
    private String sName;
    private String login;
    private String password;
    private Role role;

}
