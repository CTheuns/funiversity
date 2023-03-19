package com.example.funiversity.controller;

import com.example.funiversity.courses.CourseMapper;
import com.example.funiversity.courses.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "course")
public class CourseController {

    public CourseService courseService;
    public CourseMapper mapper;

    public CourseController(CourseService courseService, CourseMapper mapper) {
        this.courseService = courseService;
        this.mapper = mapper;
    }

    public void createNewCourse(int id, String courseName, int studyPoints, int teachingProfessorId){
      mapper.toCourseDTO(courseService.createNewCourse(id, courseName, studyPoints, teachingProfessorId));
    }

    public void getAllCourses(){
        mapper.toCourseDTO(courseService.getAllCourses());
    }

    public void getCourseById(int id){
       mapper.toCourse(courseService.getCourseById(id));
    }

    public void updateCourseById(int id, String courseName, int studyPoints, int teachingProfessorId){
        courseService.updateCourseById(id, courseName, studyPoints, teachingProfessorId);
    }

    public void deleteCourseById(int id){
        courseService.deleteCourseById(id);
    }

    public void getCoursByStudyPoints(int studyPoints){
        mapper.toCourse(courseService.getCoursByStudyPoints(studyPoints));
    }


}
