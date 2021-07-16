package org.example.service;

import org.example.domain.Teacher;
import org.example.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepo teacherRepo;

    @Autowired
    public TeacherService (TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    public void save(Teacher teacher) {
        if (teacher != null)
            teacherRepo.save(teacher);
    }

    public void delete(Teacher teacher) {
        teacherRepo.delete(teacher);
    }

    public List<Teacher> findAll() {
        return teacherRepo.findAll();
    }
}
