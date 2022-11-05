package com.arturfrimu.askme.facade;

import com.arturfrimu.askme.mapper.QuestionMapper;
import com.arturfrimu.askme.model.question.Question;
import com.arturfrimu.askme.service.question.QuestionService;
import com.arturfrimu.askme.ui.question.request.SaveQuestionRequest;
import com.arturfrimu.askme.ui.question.request.UpdateQuestionRequest;
import com.arturfrimu.askme.ui.question.response.QuestionBaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleQuestionFacade implements QuestionFacade {
    private final QuestionMapper questionMapper;
    private final QuestionService questionService;

    @Override
    public void addQuestion(SaveQuestionRequest saveQuestionRequest) {
        Question question = questionMapper.map(saveQuestionRequest);
        questionService.saveQuestion(question);
    }

    @Override
    public QuestionBaseResponse findQuestion(Long id) {
        Question question = questionService.findQuestion(id);
        return questionMapper.map(question);
    }

    @Override
    public void updateQuestion(UpdateQuestionRequest updateQuestionRequest) {
        Question question = questionMapper.map(updateQuestionRequest);
        questionService.updateQuestion(question);
    }

    @Override
    public void deleteQuestion(Long id) {
        questionService.deleteQuestion(id);
    }
}
