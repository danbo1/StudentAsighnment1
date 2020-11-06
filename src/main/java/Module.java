import java.util.ArrayList;
import java.util.List;

public class Module {

    String name;
    int id;
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Course> courses = new ArrayList<Course>();
    private static int modulesCount = 0;

    public Module(String name){
        id = modulesCount++;
        this.name = name;
    }

    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

}
