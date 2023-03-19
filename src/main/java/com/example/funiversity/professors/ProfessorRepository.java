package com.example.funiversity.professors;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfessorRepository {

    private final Professor professor1 = new Professor(1, "Hans", "Muster");
    private final Professor professor2 = new Professor(2, "Peter", "Muster");
    private final Professor professor3 = new Professor(3, "Rene", "D'Artois");
    private final Professor professor4 = new Professor(4, "Hans", "Gruber");
    private final Professor professor5 = new Professor(5, "Tim", "Tiny");

    List<Professor> databaseOfProfessors = new ArrayList<>(
            List.of(professor1, professor2, professor3, professor4, professor5));

    public List<Professor> getAllProfessor() {
        return databaseOfProfessors;
    }

    public Professor getProfessorById(int id){
        return databaseOfProfessors.stream()
                .filter(professor -> professor.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    public Professor createNewProfessor(int id, String firsName, String lastname){
        id = databaseOfProfessors.size() + 1;
        Professor newProfessor = new Professor(id ,firsName,lastname);
        databaseOfProfessors.add(newProfessor);
        return newProfessor;
    }

    public void deleteProfessorById(int id) {
        if (checkId(id) == true) {
            databaseOfProfessors.removeIf(professor -> professor.getId() == id);
        }
    }

    private boolean checkId(int id) {
       return databaseOfProfessors.contains(id);
    }

    public void updateProfessorById(int id,String firstName, String lastName){
        if (checkId(id) == true) {
            databaseOfProfessors.stream()
                    .filter(professor -> professor.getId() == id)
                    .findFirst()
                    .orElseThrow()
                    .setFirstName(firstName);
            databaseOfProfessors.stream()
                    .filter(professor -> professor.getId() == id)
                    .findFirst()
                    .orElseThrow()
                    .setLastName(lastName);
        }
    }

}
