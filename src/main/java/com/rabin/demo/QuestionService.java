package com.rabin.demo;

import java.util.List;

import org.springframework.stereotype.Service;
import java.util.Optional;;


@Service
public class QuestionService {
   private final QuestionRepository questionRepository;
   public QuestionService(QuestionRepository questionRepository){
    this.questionRepository = questionRepository;
   }
   public Question addQuestion (Question question){
    return questionRepository.save(question);
   }
   public Question updateQuestion(int id , Question question){
   
   Optional<Question> updateQuestion = questionRepository.findById(id);
   if (!updateQuestion.isPresent()) {
      throw new RuntimeException("Not Found!");
   }

Question oldQuestion = updateQuestion.get();
      oldQuestion.setTitle(question.getTitle());
      oldQuestion.setDifficulty(question.getDifficulty());
      oldQuestion.setTopic(question.getTopic());
      oldQuestion.setSolved(question.isSolved());
      questionRepository.save(oldQuestion);
   return oldQuestion;
   }
public String deleteQuestion(int id){
   Optional<Question> deleteQuestion = questionRepository.findById(id);
   if (!deleteQuestion.isPresent()) {
      throw new RuntimeException("Not Found");
   }
      questionRepository.deleteById(id);
      return "Delete Successfully";

}
public Question FoundQuestionById(int id){
   Optional<Question> getQuestionById = questionRepository.findById(id);
   if(!getQuestionById.isPresent()){
      throw new RuntimeException("Not Found");
   }
  return getQuestionById.get();
}



   public List<Question> getQuestions(){
    return questionRepository.findAll();
   }

  
    }

    

