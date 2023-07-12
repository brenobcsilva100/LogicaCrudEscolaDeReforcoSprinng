package com.example.escoladereforco.controller;

import com.example.escoladereforco.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping("/mostrarProfessor")
    public ResponseEntity<?> mostrarProfessor(){
        try {
            return new ResponseEntity<>(professorService.mostrar(), HttpStatus.OK);
        }catch (HttpMessageNotWritableException e){
            System.out.println("*****************************" + e);
        }
        return new ResponseEntity<>(professorService.mostrar(), HttpStatus.OK);
    }

}
