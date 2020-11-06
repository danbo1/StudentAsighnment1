import org.joda.time.DateTime;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private DateTime dOB;
    private int id;
    private String username;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Module> modules = new ArrayList<Module>();
    private static int studentCount = 0;

    public Student(String name,int age, DateTime dOB, String username){
        this.name = name;
        this.age = age;
        this.dOB = dOB;
        this.username = username;
        this.id = studentCount++;
    }

    public void sayHello(){
        System.out.println(name + "hello");
    }

    /**
     *function to get name
     *
     *@return name
     */
    public String getName() {
        return name;
    }

    /**
     *function to set name
     *
     *@param name used to set name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *function to get age
     *
     *@return age
     */
    public int getAge() {
        return age;
    }

    /**
     *function to set age
     *
     *@param age used to set age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *function to get dOB
     *
     *@return dOB
     */
    public DateTime getdOB() {
        return dOB;
    }

    /**
     *function to set dOB
     *
     *@param dOB used to set dOB
     */
    public void setdOB(DateTime dOB) {
        this.dOB = dOB;
    }

    /**
     *function to get id
     *
     *@return id
     */
    public int getId() {
        return id;
    }

    /**
     *function to set id
     *
     *@param id used to set id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *function to get username
     *
     *@return username
     */
    public String getUsername() {
        return username;
    }

    /**
     *function to set username
     *
     *@param username used to set username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *function to get courses
     *
     *@return courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     *function to add a course
     *
     *@param course used to add to courses
     */
    public void addCourses(Course course){
        this.courses.add(course);
    }

    /**
     *function to set courses
     *
     *@param courses used to set courses
     */
    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }

    /**
     *function to get Modules
     *
     *@return Modules
     */
    public ArrayList<Module> getModules() {
        return modules;
    }

    /**
     *function to add a module
     *
     *@param module used to add to modules
     */
    public void addModule(Module module){
        this.modules.add(module);
    }

    /**
     *function to set modules
     *
     *@param modules used to set modules
     */
    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    /**
     *function to return 1 if student is in a Course
     *
     * @param Course used to search for course
     * @return returns the indext of the chorse or -1;
     */
    public int isInCourse(Course Course){
        return courses.indexOf(Course);
    }
}
