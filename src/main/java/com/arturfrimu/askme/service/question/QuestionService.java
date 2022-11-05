package com.arturfrimu.askme.service.question;

import com.arturfrimu.askme.model.question.Question;

public interface QuestionService {
    void saveQuestion(Question question);

    Question findQuestion(Long id);

    void updateQuestion(Question question);

    void deleteQuestion(Long id);
}
