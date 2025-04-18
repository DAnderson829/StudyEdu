package com.StudyEdu.StudyEdu.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Classroom")
@Getter
@Setter
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "className", nullable = false, length = 40)
    private String className;

    @Column(name = "sessionYear", nullable = false)
    private int sessionYear;

    enum sessions{
        fall,
        spring,
        summer
    }

    @Column(name = "sessionSeason", nullable = false)
    private int sessionSeason;

    @Column(name = "classStart")
    private LocalDateTime classStart;

    @Column(name = "classEnd")
    private LocalDateTime classEnd;

    public Classroom(){}

    public Classroom(){

    }
}
