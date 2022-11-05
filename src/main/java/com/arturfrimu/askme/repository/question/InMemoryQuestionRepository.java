package com.arturfrimu.askme.repository.question;

import com.arturfrimu.askme.model.question.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryQuestionRepository implements QuestionRepository {
    private static long ID = 0;
    private final List<Question> questions = new ArrayList<>();

    @Override
    public void saveQuestion(Question question) {
        question.setId(++ID);
        questions.add(question);
    }

    @Override
    public Question findQuestion(Long id) {
        return questions.stream()
                .filter(question -> question.hasId(id))
                .findFirst()
                .orElseThrow();
    }

    @Override
    public void updateQuestion(Question question) {
        Question questionFromList = questions.stream()
                .filter(q -> q.hasId(question.getId()))
                .findFirst()
                .orElseThrow();
        questionFromList.setQuestion(question.getQuestion());
    }

    @Override
    public void deleteQuestion(Long id) {
        Question question = questions.stream().filter(q -> q.hasId(id)).findFirst().orElseThrow();
        questions.remove(question);
    }
}
