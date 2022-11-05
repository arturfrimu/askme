package com.arturfrimu.askme.service.question;

import com.arturfrimu.askme.model.question.Question;
import com.arturfrimu.askme.repository.question.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class InMemoryQuestionService implements QuestionService {

    @Value("${repository}")
    private String repository;

    @Autowired
    private final Map<String, QuestionRepository> repositories = new HashMap<>();

    @Override
    public void saveQuestion(Question question) {
        repositories.get(repository).saveQuestion(question);
    }

    @Override
    public Question findQuestion(Long id) {
        return repositories.get(repository).findQuestion(id);
    }

    @Override
    public void updateQuestion(Question question) {
        repositories.get(repository).updateQuestion(question);
    }

    @Override
    public void deleteQuestion(Long id) {
        repositories.get(repository).deleteQuestion(id);
    }
}
