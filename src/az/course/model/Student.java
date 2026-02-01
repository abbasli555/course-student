package az.course.model;

public class Student {
    private int id;
    private String name;
    private Course[] courses = new Course[2];
    public int count = 0;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void enrollCourses(Course course){
        if (course.enroll()){
            courses[count++] = course;
        }
        if (!course.enroll()){
            System.out.println("Kursa yazilmaq mumkun deyil!");
            return;
        }
    }

    public void printCourse(){
        for (int i = 0; i < count; i++){
            courses[i].printInfo();
        }
    }

}
