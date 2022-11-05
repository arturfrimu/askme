package com.arturfrimu.askme.controller.question;

import com.arturfrimu.askme.facade.QuestionFacade;
import com.arturfrimu.askme.ui.question.request.SaveQuestionRequest;
import com.arturfrimu.askme.ui.question.request.UpdateQuestionRequest;
import com.arturfrimu.askme.ui.question.response.QuestionBaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionFacade questionFacade;

    @PostMapping
    public void addQuestion(@RequestBody SaveQuestionRequest saveQuestionRequest) {
        questionFacade.addQuestion(saveQuestionRequest);
    }

    @GetMapping("/{id}")
    public QuestionBaseResponse findQuestion(@PathVariable Long id) {
        return questionFacade.findQuestion(id);
    }

    @PatchMapping
    public void updateQuestion(@RequestBody UpdateQuestionRequest updateQuestionRequest) {
        questionFacade.updateQuestion(updateQuestionRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        questionFacade.deleteQuestion(id);
    }
}
