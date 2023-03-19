package com.example.funiversity.professors;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Professor {

    private int id;
    private String firstName;
    private String lastName;

    public Professor(int id, String firstName, String lastName) {
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
    }

    List<Professor> professorDatabase = new ArrayList<>();

    public void setId(){
        int id = professorDatabase.size() + 1;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName(Professor professor){
        return professor.firstName + " " + professor.lastName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return getId() == professor.getId() && Objects.equals(getFirstName(), professor.getFirstName()) && Objects.equals(getLastName(), professor.getLastName()) && Objects.equals(professorDatabase, professor.professorDatabase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), professorDatabase);
    }
}
