package com.StudyEdu.StudyEdu.Repository;

import com.StudyEdu.StudyEdu.Entity.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardRepository extends JpaRepository<Flashcard, Long > {
}
