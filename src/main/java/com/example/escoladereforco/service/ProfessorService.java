package com.example.escoladereforco.service;

import com.example.escoladereforco.persistence.model.Professor;
import com.example.escoladereforco.persistence.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> mostrar(){
        return professorRepository.findAll();
    }
}
