package com.example.escoladereforco.persistence.repository;

import com.example.escoladereforco.persistence.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
