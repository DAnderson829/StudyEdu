package com.StudyEdu.StudyEdu.Repository;

import com.StudyEdu.StudyEdu.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
