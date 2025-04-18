package com.StudyEdu.StudyEdu.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "set")
public class Set {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long set_id;

    @Column(nullable = false, length = 20)
    private String title;

    @Column(nullable = false, length = 100)
    private String description;

    @ManyToOne
    @JoinColumn(nullable = false)
    private User creator;

    public Set(){}

    public Set(String title, String description, User creator){
        this.title = title;
        this.description = description;
        this.creator = creator;
    }



}
