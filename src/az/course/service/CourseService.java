package az.course.service;

import az.course.model.Course;

public class CourseService {
    private Course[] courses = new Course[5];
    static int totalCourses = 0;

    public void addCourse(Course course){
        courses[totalCourses++] = course;
    }

    public void listCourses(){
        for (int i = 0; i < totalCourses; i++){
            courses[i].printInfo();
        }
    }
}