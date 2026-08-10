package com.org.skypro.exam;

import com.org.skypro.exam.model.domain.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import com.org.skypro.exam.service.ExaminerServiceImpl;
import com.org.skypro.exam.service.QuestionServices;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) 
class ExaminerServiceImplTest {

    @Mock
    private QuestionServices questionServices; 

    @InjectMocks
    private ExaminerServiceImpl examinerService; 

    private List<Question> mockQuestions;

    @BeforeEach
    void setUp() {
        mockQuestions = new ArrayList<>();
        mockQuestions.add(new Question("Q1", "A1"));
        mockQuestions.add(new Question("Q2", "A2"));
        mockQuestions.add(new Question("Q3", "A3"));
    }

    @Test
    void getQuestions_Success_ReturnsRequestedAmount() {
        int amount = 2;
        when(questionServices.getAll()).thenReturn(mockQuestions);

        Collection<Question> result = examinerService.getQuestions(amount);

        assertEquals(amount, result.size());
        assertTrue(mockQuestions.containsAll(result));
    }

    @Test
    void getQuestions_AmountMoreThanAvailable_ShouldThrowBadRequest() {
        int amount = 5; 
        when(questionServices.getAll()).thenReturn(mockQuestions);

        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
            examinerService.getQuestions(amount);
        });

        assertEquals(HttpStatus.BAD_REQUEST, exception.getStatusCode());
    }

    @Test
    void getQuestions_AmountIsZero_ShouldReturnEmptyCollection() {
        int amount = 0;
        when(questionServices.getAll()).thenReturn(mockQuestions);

        Collection<Question> result = examinerService.getQuestions(amount);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
    
    @Test
    void getQuestions_AmountNegative_ShouldThrowBadRequest() {
        int amount = -1;
        when(questionServices.getAll()).thenReturn(mockQuestions);

        assertThrows(ResponseStatusException.class, () -> {
            examinerService.getQuestions(amount);
        });
    }

       @Test
        void getQuestions_EmptySource_ShouldThrowBadRequestIfAmountPositive() {
            when(questionServices.getAll()).thenReturn(Collections.emptyList()); 

            assertThrows(ResponseStatusException.class, () -> {
                examinerService.getQuestions(1);
            });
            
            assertDoesNotThrow(() -> {
                Collection<Question> result = examinerService.getQuestions(0);
                assertTrue(result.isEmpty());
            });
        }
    }
