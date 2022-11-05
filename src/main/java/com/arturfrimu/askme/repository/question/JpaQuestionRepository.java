package com.arturfrimu.askme.repository.question;

import com.arturfrimu.askme.model.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaQuestionRepository extends JpaRepository<Question, Long>{

}
