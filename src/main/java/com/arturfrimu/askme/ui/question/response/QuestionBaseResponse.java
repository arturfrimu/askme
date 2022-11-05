package com.arturfrimu.askme.ui.question.response;

public class QuestionBaseResponse {
    private String question;

    public QuestionBaseResponse(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
