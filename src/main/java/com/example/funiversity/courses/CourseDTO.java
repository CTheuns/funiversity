package com.example.funiversity.courses;

import com.example.funiversity.professors.ProfessorDTO;

public class CourseDTO {

    private final int idDTO;
    private final String courseNameDTO;
    private final int studypointsDTO;
    private final int teachingProfessorIdDTO;

    public CourseDTO(int idDTO, String courseNameDTO, int studypointsDTO, int teachingProfessorIdDTO) {
        this.idDTO = idDTO;
        this.courseNameDTO = courseNameDTO;
        this.studypointsDTO = studypointsDTO;
        this.teachingProfessorIdDTO = teachingProfessorIdDTO;
    }

    public int getIdDTO() {
        return idDTO;
    }

    public String getCourseNameDTO() {
        return courseNameDTO;
    }

    public int getStudypointsDTO() {
        return studypointsDTO;
    }

    public int getteachingProfessorIdDTO() {
        return teachingProfessorIdDTO;
    }
}
