package assignment1_b;

import assignment1_a.Student;
import assignment1_a.Module;
import assignment1_a.Course;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author sam
 */
public class Driver {
    
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Module> modules = new ArrayList<Module>();
        // create a couple students -5
        Student s1 = new Student("Tim", new DateTime(1996, 1, 1, 5, 35), "s1");
        Student s2 = new Student("Jim", new DateTime(1997, 1, 1, 5, 35), "s2");
        Student s3 = new Student("Kim", new DateTime(1998, 1, 1, 5, 35), "s3");
        Student s4 = new Student("Sim", new DateTime(1996, 1, 5, 5, 35), "s4");
        Student s5 = new Student("Bin", new DateTime(1996, 1, 8, 5, 35), "s5");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        // create a couple modules -3
        Module m1 = new Module("CS101", "m1");
        Module m2 = new Module("CT417", "m2");
        Module m3 = new Module("CT414", "m3");
        modules.add(m1);
        modules.add(m2);
        modules.add(m3);
        // create a course
        DateTime start = new DateTime(2015, 12, 03, 0, 0);
        DateTime end = new DateTime(2019, 05, 01, 0, 0);
        Course c1 = new Course("ECE", start, end);
        // add students to modules
        m1.addStudent(s1);
        m1.addStudent(s2);
        m1.addStudent(s3);
        m1.addStudent(s4);
        m1.addStudent(s5);
        m2.addStudent(s1);
        m2.addStudent(s2);
        m2.addStudent(s3);
        m2.addStudent(s4);
        m2.addStudent(s5);
        m3.addStudent(s1);
        m3.addStudent(s3);
        m3.addStudent(s5);
        // add modules to course
        c1.addModule(m1);
        c1.addModule(m2);
        c1.addModule(m3);
        // print out a list of all data and it's relationship  
        String tab = "\t";
        String branch = "+-- ";
        System.out.println("|-- " + c1.getName());
        for (Module m : c1.getModules()) {
            System.out.println("|" + tab + branch + m.getName());
            for (Student s : m.getStudents()) {
                System.out.println("|" + tab + tab + branch + s.getName());
            }
        }
    }   
}
