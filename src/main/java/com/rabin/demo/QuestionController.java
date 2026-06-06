package com.rabin.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    
    @GetMapping("/questions")
    List<Question> getQuestions(){
        return questionService.getQuestions();
    }


    @PostMapping("/questions")
    public Question addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @PutMapping("/questions/{id}")
    public Question updateQuestion(@PathVariable int id ,
        @RequestBody Question question){
            return questionService.updateQuestion(id, question);

            
        }
      
      @DeleteMapping("/questions/{id}")
        public String deleteQuestion(@PathVariable int id){
           questionService.deleteQuestion(id);
           return "Delete Successfully";
            }

            @GetMapping("questions/{id}")
            public Question getQuestionById(@PathVariable int id){
                return questionService.FoundQuestionById(id);
            }
      }  

    
    




