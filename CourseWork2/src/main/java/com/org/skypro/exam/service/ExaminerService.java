package com.org.skypro.exam.service;

import java.util.Collection;
import com.org.skypro.exam.model.domain.Question;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
    
}
