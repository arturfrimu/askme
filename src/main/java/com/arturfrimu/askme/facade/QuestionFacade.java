package com.arturfrimu.askme.facade;

import com.arturfrimu.askme.ui.question.request.SaveQuestionRequest;
import com.arturfrimu.askme.ui.question.request.UpdateQuestionRequest;
import com.arturfrimu.askme.ui.question.response.QuestionBaseResponse;

public interface QuestionFacade {
    void addQuestion(SaveQuestionRequest saveQuestionRequest);

    QuestionBaseResponse findQuestion(Long id);

    void updateQuestion(UpdateQuestionRequest updateQuestionRequest);

    void deleteQuestion(Long id);
}
