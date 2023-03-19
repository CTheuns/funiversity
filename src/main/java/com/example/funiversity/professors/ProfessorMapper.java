package com.example.funiversity.professors;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProfessorMapper {

    public ProfessorDTO ToProfessorDTO(Professor professor) {
        return new ProfessorDTO(professor.getId(), professor.getFirstName(), professor.getLastName());
    }

    public Professor ToProfessor(ProfessorDTO professorDTO) {
        return new Professor(professorDTO.getIdDTO(), professorDTO.getFirstNameDTO(), professorDTO.getLastNameDTO());
    }

    public List<ProfessorDTO> ToDatabaseOfProfessorsDTO(List<Professor> databaseOfProfessors) {
        return databaseOfProfessors.stream()
                .map(this::ToProfessorDTO)
                .toList();
    }

    public List<Professor> ToDatabaseOfProfessors(List<ProfessorDTO> databaseOfProfessorsDTO){
        return databaseOfProfessorsDTO.stream()
                .map(this::ToProfessor)
                .toList();
    }
}
