package com.example.funiversity.courses;

import com.example.funiversity.professors.Professor;

import java.util.ArrayList;
import java.util.List;


public class Course {

    private int courseId;
    private String courseName;
    private int studyPoints;
    private  Professor teachingProfessor;
    private int teacherId ;
    public List<Course> courseDatabase = new ArrayList<>();

    //this should get the professor id from the professor class

    public Course(int courseId, String courseName, int studyPoints, int teacherId) {
        courseIdGenerator();
        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            this.courseName = courseName;
        }
        setStudyPoints(studyPoints);
        if (teacherId != 0 ) {

            this.teacherId = teachingProfessor.getId();
        } else {
            throw new IllegalArgumentException();
        }
    }

    private void courseIdGenerator() {
        if (courseDatabase.size() > 0) {
            int id = courseDatabase.size() + 1;
        } else {
            int id = 1;
        }
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getStudyPoints() {
        return studyPoints;
    }

    public String getTeachingProfessor() {
        return teachingProfessor.getFullName(teachingProfessor);
    }

public void setStudyPoints(int studyPoints) {
        if (studyPoints > 0 && studyPoints < 101) {
            this.studyPoints = studyPoints;
        }
    }


    public int getTeacherId() {
        return teacherId;
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            this.courseName = courseName;
        }
    }

    public void setTeacherId(int teachingProfessorId) {
        if (teachingProfessorId != 0) {
            this.teacherId = teachingProfessorId;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getTeachingProfessorID() {
        return teachingProfessor.getId();
    }
}
