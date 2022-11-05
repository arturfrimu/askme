package com.arturfrimu.askme.repository.question;

import com.arturfrimu.askme.model.question.Question;

public interface QuestionRepository {
    void saveQuestion(Question question);

    Question findQuestion(Long id);

    void updateQuestion(Question question);

    void deleteQuestion(Long id);
}
