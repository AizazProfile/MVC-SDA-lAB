package MVC.View;

import MVC.Student.Student;
import java.util.List;

public class View {
    public void printStudentList(List<Student> students) {
        System.out.println("---- Student List ----");
        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            System.out.println("Phone: " + s.getPhoneNumber());
            System.out.println("Address: " + s.getAddress());
            System.out.println("Reg#: " + s.getRegistrationNumber());
            System.out.println("GPA: " + s.getGpa());
            System.out.println("----------------------");
        }
    }

    public void printGpaStats(double average, List<Student> goodGpa, List<Student> badGpa) {
        System.out.println("\nAverage GPA: " + average);
        System.out.println("\nGood GPA Students (>= 3.0):");
        for (Student s : goodGpa) {
            System.out.println(s.getName() + " - " + s.getGpa());
        }

        System.out.println("\nBad GPA Students (< 3.0):");
        for (Student s : badGpa) {
            System.out.println(s.getName() + " - " + s.getGpa());
        }
    }
}
