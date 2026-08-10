package com.org.skypro.exam;

import com.org.skypro.exam.service.JavaQuestionService;
import com.org.skypro.exam.model.domain.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;



class JavaQuestionServiceTest {

    private JavaQuestionService service;

    @BeforeEach
    void setUp() {
        service = new JavaQuestionService();
    }

    @Test
    void addQuestionWithStrings_Success() {
        String qText = "Что такое JVM?";
        String aText = "Java Virtual Machine";

        Question added = service.add(qText, aText);

        assertNotNull(added);
        assertEquals(qText, added.getQuestion());
        assertEquals(aText, added.getAnswer());
        assertEquals(1, service.getAll().size());
    }

    @Test
    void addQuestionObject_Success() {
        Question question = new Question("Что такое JDK?", "Java Development Kit");

        Question added = service.add(question);

        assertSame(question, added);
        assertEquals(1, service.getAll().size());
    }

    @Test
    void addDuplicateQuestion_ShouldNotIncreaseSize() {
        Question q1 = new Question("Что такое JRE?", "Java Runtime Environment");
        Question q2 = new Question("Что такое JRE?", "Java Runtime Environment"); 

        service.add(q1);
        service.add(q2);

        assertEquals(1, service.getAll().size());
    }

    @Test
    void removeQuestion_Success() {
        Question question = new Question("Remove me", "Answer");
        service.add(question);
        assertEquals(1, service.getAll().size());

        Question removed = service.remove(question);

        assertNotNull(removed);
        assertEquals(0, service.getAll().size());
    }

    @Test
    void removeNonExistentQuestion_ShouldReturnNullSafeOrFalseLogic() {
        Question toRemove = new Question("Ghost", "Answer");
        Question result = service.remove(toRemove);

        assertNotNull(result); 
        assertEquals(0, service.getAll().size());
    }

    @Test
    void getAll_EmptyCollection() {
        Collection<Question> all = service.getAll();

        assertNotNull(all);
        assertTrue(all.isEmpty());
    }

    @Test
    void getRandomQuestion_FromNonEmptyCollection() {
        service.add("Q1", "A1");
        service.add("Q2", "A2");

        Question random = service.getRandomQuestion();

        assertNotNull(random);
        assertTrue(random.getQuestion().equals("Q1") || random.getQuestion().equals("Q2"));
    }

    @Test
    void getRandomQuestion_FromEmptyCollection_ShouldReturnNull() {
        Question random = service.getRandomQuestion();

        assertNull(random);
    }
}