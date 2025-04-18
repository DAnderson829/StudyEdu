package com.StudyEdu.StudyEdu.Repository;

import com.StudyEdu.StudyEdu.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    Optional<Quiz> findByTitle(String title);

    Optional<Quiz> findByCreator(String username);
}
