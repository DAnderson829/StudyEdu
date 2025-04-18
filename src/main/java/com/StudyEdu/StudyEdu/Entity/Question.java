package com.StudyEdu.StudyEdu.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "question")
public class Question {
    public enum type{
        choice,
        trueOrFalse,
        fillInBlank,
        match
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long question_id;

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    private String answer;

    @Enumerated
    @Column(nullable = false)
    private type questionType;

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    private Quiz quiz;

    public Question(){}

    public Question(type questionType, String question, String answer, Quiz quiz){
        this.questionType = questionType;
        this.question = question;
        this.answer = answer;
        this.quiz = quiz;
    }
}
