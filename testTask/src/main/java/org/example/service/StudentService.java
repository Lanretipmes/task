package org.example.service;

import org.example.domain.Student;
import org.example.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    @Autowired
    public StudentService (StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    public void save(Student student) {
        if (student != null)
            studentRepo.save(student);
    }

    public void delete(Student student) {
        studentRepo.delete(student);
    }

    public List<Student> findAll() {
        return studentRepo.findAll();
    }

}
