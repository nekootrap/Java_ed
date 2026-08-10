package com.org.skypro.exam.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.org.skypro.exam.model.domain.Question;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionServices questionServices;

    @Autowired
    public ExaminerServiceImpl(QuestionServices questionServices) {
        this.questionServices = questionServices;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        List<Question> allQuestions = new ArrayList<>(questionServices.getAll());
        
        if (amount > allQuestions.size()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, 
                "Запрошено " + amount + " вопросов, а в базе только " + allQuestions.size());
        }
        
        if (amount < 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Количество не может быть отрицательным");
        }

        Collections.shuffle(allQuestions); 
        return allQuestions.subList(0, amount); 
    
    }
}
