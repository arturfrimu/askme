package com.arturfrimu.askme.mapper;

import com.arturfrimu.askme.model.question.Question;
import com.arturfrimu.askme.ui.question.request.SaveQuestionRequest;
import com.arturfrimu.askme.ui.question.request.UpdateQuestionRequest;
import com.arturfrimu.askme.ui.question.response.QuestionBaseResponse;
import org.springframework.stereotype.Service;

@Service
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public Question map(SaveQuestionRequest saveQuestionRequest) {
        return new Question(saveQuestionRequest.getQuestion());
    }

    @Override
    public QuestionBaseResponse map(Question question) {
        return new QuestionBaseResponse(question.getQuestion());
    }

    @Override
    public Question map(UpdateQuestionRequest updateQuestionRequest) {
        return new Question(updateQuestionRequest.getId(), updateQuestionRequest.getQuestion());
    }
}
