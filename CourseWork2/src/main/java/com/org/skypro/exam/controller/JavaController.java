package com.org.skypro.exam.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.skypro.exam.model.domain.Question;
import com.org.skypro.exam.service.QuestionServices; 

@RestController
@RequestMapping("/exam/java") 
public class JavaController {
    
    private final QuestionServices questionServices; 

    public JavaController(QuestionServices questionServices) {
        this.questionServices = questionServices;
    }

    @PostMapping("/add") 
    public Question add(@RequestParam String question, @RequestParam String answer) {
        return questionServices.add(question, answer);
    }

    @DeleteMapping("/remove") 
    public Question remove(@RequestParam String question, @RequestParam String answer) {
        return questionServices.remove(new Question(question, answer));
    }
    
    @GetMapping 
    public Collection<Question> getAll() {
        return questionServices.getAll();
    }
}