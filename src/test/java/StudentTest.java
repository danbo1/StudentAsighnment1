import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void getUsername() {
    }

    @org.junit.jupiter.api.Test
    void setUsername() {
    }

    @Test
    public void testGetAndSet(){
        //Arrange
        Student testClass = new Student("a",11,new DateTime(),"a.a");
        //Act

        //Assert
        assertEquals("a", testClass.getName(),"return name should be equal to set name");
    }

    @Parameterized.Parameters
    public static List<Object[]> data(){
        List<Object[]> list = new ArrayList<Object[]>();

        Course testCourse1 = new Course("ct1",new DateTime(),new DateTime());
        Course testCourse2 = new Course("ct1",new DateTime(),new DateTime());

        list.add(new Object[]{testCourse1,testCourse1,0,"return should be index of chorse"});
        list.add(new Object[]{testCourse1,testCourse2,-1,"return should be index of chorse"});

        return list;
    }

    @Test
    public void testIsInCourse(){
        //Arrange
        Student testClass = new Student("a",11,new DateTime(),"a.a");
        List<Object[]> data = data();
        for(Object[] testData: data){
            //Act
            testClass.addCourses((Course) testData[0]);
            //Assert
            assertEquals(testData[2], testClass.isInCourse((Course) testData[1]),(String) testData[3]);
        }
    }
}