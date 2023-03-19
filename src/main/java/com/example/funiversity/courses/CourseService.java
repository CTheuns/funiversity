package com.example.funiversity.courses;

import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository repository;
    private final CourseMapper mapper;

    public CourseService(CourseRepository repository, CourseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Course createNewCourse(int id, String courseName, int studyPoints, int teachingProfessorId){
        Course newCourse = repository.createNewCourse(id, courseName, studyPoints, teachingProfessorId);
        return newCourse;
    }

    public CourseDTO getCourseById(int id){
        return mapper.toCourseDTO(repository.getCourseById(id));
    }

    public void deleteCourseById(int id){
        repository.deleteCourseById(id);
    }

    public void updateCourseById(int id, String courseName, int studyPoints, int teachingProfessorId){
        repository.updateCourseById(id, courseName, studyPoints, teachingProfessorId);
    }

    public CourseDTO getCoursByStudyPoints(int studyPoints){
        return mapper.toCourseDTO(repository.getCourseByStudyPoints(studyPoints));
    }

    public Course getAllCourses() {
        repository.getAllCourses();
        return null;
    }
}
