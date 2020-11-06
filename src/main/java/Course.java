import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course {

    String name;
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Module> modules = new ArrayList<Module>();
    DateTime startDate;
    DateTime endDate;
    int courseId;
    private static int courseCount = 0;

    public Course(String name,DateTime startDate,DateTime endDate){
        courseId = courseCount++;
        this.name = name;
        this.endDate = endDate;
        this.startDate = startDate;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void addModule(Module module){
        this.modules.add(module);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }


}
