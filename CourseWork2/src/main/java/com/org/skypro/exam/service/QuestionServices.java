package com.org.skypro.exam.service;

import java.util.Collection;
import com.org.skypro.exam.model.domain.Question;

public interface QuestionServices {
    Question add(String question, String answer);
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();
}
