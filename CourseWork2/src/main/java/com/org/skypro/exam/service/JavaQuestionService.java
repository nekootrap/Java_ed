package com.org.skypro.exam.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.skypro.exam.model.domain.Question;

@Service
public class JavaQuestionService implements QuestionServices {
    private final Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        return add(newQuestion); 
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }
    
    @Override
    public Question remove(Question question){
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll(){
        return new HashSet<>(questions);
    }


    @Override
    public Question getRandomQuestion(){
        if (questions.isEmpty()) {
            return null; 
        }

        int randomIndex = ThreadLocalRandom.current().nextInt(questions.size());
        return questions.stream()
                .skip(randomIndex)
                .findFirst()
                .orElse(null);
    }






}
