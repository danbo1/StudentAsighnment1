import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void addStudentsFromModules() {
        //Arrange
        ArrayList<Student> classA = new ArrayList<Student>();
        ArrayList<Student> classB = new ArrayList<Student>();

        Student s1 = new Student("a",11,new DateTime(),"a.a"); classA.add(s1);
        Student s2 = new Student("b",11,new DateTime(),"a.a"); classA.add(s2);
        Student s3 = new Student("c",11,new DateTime(),"a.a"); classA.add(s3); classB.add(s3);
        Student s4 = new Student("d",11,new DateTime(),"a.a"); classB.add(s4);
        Student s5 = new Student("f",11,new DateTime(),"a.a"); classB.add(s5);

        Module module1 = new Module("ct1"); module1.setStudents(classA);
        Module module2 = new Module("ct2"); module2.setStudents(classB);

        Course testClass = new Course("test", new DateTime(), new DateTime());
        testClass.addModule(module1);
        testClass.addModule(module2);

        //Act
        testClass.addStudentsFromModules();

        //Assert
        ArrayList<Student> testStudents = testClass.getStudents();
        assertEquals(testStudents.size(), 5,"5 Students in the class no duplicates");
    }
}