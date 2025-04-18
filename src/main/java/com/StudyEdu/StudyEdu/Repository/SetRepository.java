package com.StudyEdu.StudyEdu.Repository;

import com.StudyEdu.StudyEdu.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import com.StudyEdu.StudyEdu.Entity.Set;

import java.util.Optional;

public interface SetRepository extends JpaRepository<Set, Long> {

    Optional<Set> findByTitle(String title);

    Optional<Quiz> findByCreator(String username);

}
