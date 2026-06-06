package com.rabin.demo;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "questions")
public class Question {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String difficulty;
    private String topic;
    private boolean solved;
     
    public Question(int id,String title,String difficulty,String topic,boolean solved){
        this.id = id;
        this.title = title;
        this.difficulty = difficulty;
        this.topic = topic;
        this.solved = solved;
    }
    public Question(){

    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

     public String getDifficulty(){
        return difficulty;
    }
    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }

    public String getTopic(){
        return topic;
    }
    public void setTopic(String topic){
        this.topic = topic;
    }

    public boolean isSolved(){
        return solved;
    }
    public void setSolved(boolean solved){
        this.solved = solved;
    }
}
