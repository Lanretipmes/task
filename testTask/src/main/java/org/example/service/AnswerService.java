package org.example.service;

import org.example.domain.Answer;
import org.example.repo.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    private final AnswerRepo answerRepo;

    @Autowired
    public AnswerService(AnswerRepo answerRepo) {
        this.answerRepo = answerRepo;
    }

    public void save(Answer answer) {
        if (answer != null)
            answerRepo.save(answer);
    }

    public void delete(Answer answer) {
        answerRepo.delete(answer);
    }

    public List<Answer> findAll() {
        return answerRepo.findAll();
    }

}
