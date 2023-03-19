package com.example.funiversity.courses;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class CourseRepository {

    Course course = new Course(1, "Philosophy", 10, 5);
    Course course2 = new Course(2, "Math", 10, 5);
    Course course3 = new Course(3, "History", 10, 1);
    Course course4 = new Course(4, "Biology", 10, 2);
    Course course5 = new Course(5, "Physics", 10, 3);
    Course course6 = new Course(6, "Chemistry", 10, 4);
    Course course7 = new Course(7, "Geography", 10, 1);

    List<Course> databaseOfCourses = new ArrayList<>(
            List.of(course, course2, course3, course4, course5, course6, course7));

    public List<Course> getAllCourses() {
        return databaseOfCourses;
    }

    public Course getCourseById(int id){
        return databaseOfCourses.stream()
                .filter(course -> course.getCourseId() == id)
                .findFirst()
                .orElseThrow();
    }

    public Course getCourseByName(String courseName){
        return databaseOfCourses.stream()
                .filter(course -> course.getCourseName().equals(courseName))
                .findFirst()
                .orElseThrow();
    }

    public Course getCourseByStudyPoints(int studyPoints){
        return databaseOfCourses.stream()
                .filter(course -> course.getStudyPoints() == studyPoints)
                .findFirst()
                .orElseThrow();
    }

    public Course getCourseByTeachingProfessor(int teacherId){
        return databaseOfCourses.stream()
                .filter(course -> course.getTeacherId() == teacherId)
                .findFirst()
                .orElseThrow();
    }

    public Course createNewCourse(int id, String courseName, int studyPoints, int teachingProfessor){
        id = databaseOfCourses.size() + 1;
        Course newCourse = new Course(id ,courseName,studyPoints,teachingProfessor);
        databaseOfCourses.add(newCourse);
        return newCourse;
    }

    public void deleteCourseById(int id) {
        if (checkId(id) == true) {
            databaseOfCourses.removeIf(course -> course.getCourseId() == id);
        }
    }

    private boolean checkId(int id) {
        return databaseOfCourses.contains(id);
    }

    public void updateCourseById(int id, String courseName, int studyPoints, int teachingProfessorId) {
        if (checkId(id) == true) {
            Course course = getCourseById(id);
            course.setCourseName(courseName);
            course.setStudyPoints(studyPoints);
            course.setTeacherId(teachingProfessorId);
        }
    }
}
