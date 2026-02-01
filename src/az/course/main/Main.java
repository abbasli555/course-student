package az.course.main;

import az.course.model.Course;
import az.course.model.Student;
import az.course.service.CourseService;

public class Main {
    static void main(String[] args) {
        Course course1 = new Course(1,"Kainat", 10,9);
        Course course2 = new Course(2, " Guven", 15,16);
        Course course3 = new Course(3,"Hedef", 12,15);

        Student student = new Student(1,"ALI");

        CourseService cs = new CourseService();

        cs.addCourse(course1);
        cs.addCourse(course2);
        cs.addCourse(course3);

        student.enrollCourses(course1);
        student.enrollCourses(course2);
        student.enrollCourses(course3);


        cs.listCourses();


        student.printCourse();
    }


}

