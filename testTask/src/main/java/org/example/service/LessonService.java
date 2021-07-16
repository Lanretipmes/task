package org.example.service;

import org.example.domain.Lesson;
import org.example.repo.LessonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {

    private final LessonRepo lessonRepo;

    @Autowired
    public LessonService(LessonRepo lessonRepo) {
        this.lessonRepo = lessonRepo;
    }

    public void save(Lesson lesson) {
        if (lesson != null)
            lessonRepo.save(lesson);
    }

    public void delete(Lesson lesson) {
        lessonRepo.delete(lesson);
    }

    public List<Lesson> findAll() {
        return lessonRepo.findAll();
    }

}
