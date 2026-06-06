package com.rabin.demo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
public interface QuestionRepository extends JpaRepository<Question, Integer>{
List<Question> findByTitle(String title);
List<Question> findByDifficulty(String difficulty);
List<Question> findByTopic(String topic);
List<Question> findBySolved(boolean solved);
}