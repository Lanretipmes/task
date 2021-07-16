package org.example.service;

import org.example.domain.Question;
import org.example.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepo questionRepo;

    @Autowired
    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    public void save(Question question) {
        if (question != null)
            questionRepo.save(question);
    }

    public void delete(Question question) {
        questionRepo.delete(question);
    }

    public List<Question> findAll() {
        return questionRepo.findAll();
    }

}
