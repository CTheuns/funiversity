package com.example.funiversity.professors;

public class ProfessorDTO {

    private final int idDTO;
    private final String firstNameDTO;
    private final String lastNameDTO;

    public ProfessorDTO(int idDTO, String firstNameDTO, String lastNameDTO) {
        this.idDTO = idDTO;
        this.firstNameDTO = firstNameDTO;
        this.lastNameDTO = lastNameDTO;
    }

    public int getIdDTO() {
        return idDTO;
    }

    public String getFirstNameDTO() {
        return firstNameDTO;
    }

    public String getLastNameDTO() {
        return lastNameDTO;
    }
}
