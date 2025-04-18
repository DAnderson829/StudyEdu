package com.StudyEdu.StudyEdu.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "flashcard")
public class Flashcard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flashcard_id;

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    private String answer;

    @ManyToOne
    @JoinColumn(name = "set_id", nullable = false)
    private Set set;

    public Flashcard(){}

    public Flashcard(String question, String answer){
        this.question = question;
        this.answer = answer;
    }
}
