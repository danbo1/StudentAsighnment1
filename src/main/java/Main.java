import org.joda.time.DateTime;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("a",11,new DateTime(),"a.a");
        Student s2 = new Student("a",11,new DateTime(),"a.a");
        System.out.println(s1.getId());
        System.out.println(s2.getId());
        s1.sayHello();
    }

}
