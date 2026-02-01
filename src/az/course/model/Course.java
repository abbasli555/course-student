package az.course.model;

public class Course {
    private int id;
    private String name;
    private int capacity;
    private int enrolledCount;

    public Course(int id, String name, int capacity, int enrolledCount){
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.enrolledCount = enrolledCount;
    }

    public boolean enroll(){
        if (enrolledCount < capacity){
            return true;
        }
        return false;
    }

    public void printInfo(){
        System.out.println("ID : " + id +
                " AD : " + name +
                " Tutum : " + capacity +
                " Qeydiyyatdan kecenler : " + enrolledCount);
    }
}