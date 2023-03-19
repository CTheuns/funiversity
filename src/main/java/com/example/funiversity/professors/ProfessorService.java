package com.example.funiversity.professors;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;
    private final ProfessorMapper mapper;

    public ProfessorService(ProfessorRepository repository, ProfessorMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Professor createNewProfessor(int id, String firstName, String lastName){
        Professor newProfessor = repository.createNewProfessor(id, firstName, lastName);
        return newProfessor;
    }

    public List<ProfessorDTO> getAllProfessors(){
       return mapper.ToDatabaseOfProfessorsDTO(repository.databaseOfProfessors);
    }

    public ProfessorDTO getProfessorById(int id){
        return mapper.ToProfessorDTO(repository.getProfessorById(id));
    }

    public void deleteProfessorById(int id){
        repository.deleteProfessorById(id);
    }

    public void updateProfessorById(int id, String firstName, String lastName){
        repository.updateProfessorById(id, firstName, lastName);
    }




}
