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

    /**
     *  function to auto set the students by extracting them from the Modules.
     */
    public void addStudentsFromModules(){

        ArrayList<Integer> studentIds = new ArrayList<Integer>();
        ArrayList<Student> studentsToAdd = new ArrayList<Student>();

        for(int i = 0; i < modules.size();i++){
            Module temp = modules.get(i);
            ArrayList<Student> studentsTemp = temp.getStudents();

            for(int j = 0; j < studentsTemp.size(); j++){
                Student checkStudent = studentsTemp.get(j);

                if(studentIds.size() == 0){
                    studentIds.add(checkStudent.getId());
                    studentsToAdd.add(checkStudent);
                }else{
                    boolean hasStudent = false;

                    for(int k = 0; k < studentIds.size(); k++){
                        if(studentIds.get(k) == checkStudent.getId()){
                            hasStudent = true;
                        }
                    }

                    if(hasStudent != true) {
                        studentIds.add(checkStudent.getId());
                        studentsToAdd.add(checkStudent);
                    }
                }
            }
        }
        this.students = studentsToAdd;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }


}
