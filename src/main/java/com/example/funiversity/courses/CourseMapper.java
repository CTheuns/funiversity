package com.example.funiversity.courses;

import org.springframework.stereotype.Component;

@Component
public class CourseMapper {

    public CourseDTO toCourseDTO(Course course) {
        return new CourseDTO(course.getCourseId(), course.getCourseName(), course.getStudyPoints(), course.getTeachingProfessorID());
    }

    public Course toCourse(CourseDTO courseDTO) {
        return new Course(courseDTO.getIdDTO(), courseDTO.getCourseNameDTO(), courseDTO.getStudypointsDTO(), courseDTO.getteachingProfessorIdDTO());
    }




}
