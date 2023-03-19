package com.example.funiversity.controller;

import com.example.funiversity.professors.ProfessorDTO;
import com.example.funiversity.professors.Professor;
import com.example.funiversity.professors.ProfessorMapper;
import com.example.funiversity.professors.ProfessorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "professor")
public class ProfessorController {

    public ProfessorService professorService;
    public ProfessorMapper mapper;

    public ProfessorController(ProfessorService professorService, ProfessorMapper mapper) {
        this.professorService = professorService;
        this.mapper = mapper;
    }

    public Professor createNewProfessor(int id, String firstName, String lastName){
        return professorService.createNewProfessor(id, firstName,lastName);
    }

    public List<ProfessorDTO> getAllProfessors(){
       return professorService.getAllProfessors();
    }

    public ProfessorDTO getProfessorById(int id){
        return professorService.getProfessorById(id);
    }

    public void updateProfessorById(int id, String firstName, String lastName){
        professorService.updateProfessorById(id, firstName, lastName);
    }

    public void deleteProfessorById(int id){
        professorService.deleteProfessorById(id);
    }

}

