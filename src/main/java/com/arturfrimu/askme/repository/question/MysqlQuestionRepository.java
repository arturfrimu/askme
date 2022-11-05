package com.arturfrimu.askme.repository.question;

import com.arturfrimu.askme.model.question.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MysqlQuestionRepository implements QuestionRepository {
    private final JpaQuestionRepository jpaQuestionRepository;

    @Override
    public void saveQuestion(Question question) {
        jpaQuestionRepository.save(question);
    }

    @Override
    public Question findQuestion(Long id) {
        return jpaQuestionRepository.findById(id).orElseThrow();
    }

    @Override
    public void updateQuestion(Question question) {
        jpaQuestionRepository.save(question);
    }

    @Override
    public void deleteQuestion(Long id) {
        jpaQuestionRepository.deleteById(id);
    }
}
