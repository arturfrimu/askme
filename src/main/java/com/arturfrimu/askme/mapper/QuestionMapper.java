package com.arturfrimu.askme.mapper;

import com.arturfrimu.askme.model.question.Question;
import com.arturfrimu.askme.ui.question.request.SaveQuestionRequest;
import com.arturfrimu.askme.ui.question.request.UpdateQuestionRequest;
import com.arturfrimu.askme.ui.question.response.QuestionBaseResponse;

public interface QuestionMapper {
    Question map(SaveQuestionRequest saveQuestionRequest);
    QuestionBaseResponse map(Question question);
    Question map(UpdateQuestionRequest updateQuestionRequest);
}
