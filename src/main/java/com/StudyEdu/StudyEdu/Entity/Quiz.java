package com.StudyEdu.StudyEdu.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quiz_id;

    @Column(name = "title", nullable = false, length = 20)
    private String title;

    @Column(nullable = false, length = 100)
    private String description;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> questions = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User creator;

    public Quiz(){}

    public Quiz(String title, String description, User creator){
        this.title = title;
        this.description = description;
        this.creator = creator;
    }
}
