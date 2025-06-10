package MVC.Controller;

import MVC.Model.Model;
import MVC.Student.Student;
import MVC.View.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void addStudents() {
        model.addStudent(new Student("Zara", "123", "Islamabad", "FA21-BCS-123", 3.5));
        model.addStudent(new Student("Ali", "456", "Lahore", "FA21-BCS-456", 2.4));
        model.addStudent(new Student("Sara", "789", "Karachi", "FA21-BCS-789", 3.8));
    }

    public void updateView() {
        List<Student> students = model.getStudents();
        List<Student> goodGpa = new ArrayList<>();
        List<Student> badGpa = new ArrayList<>();

        double totalGpa = 0;
        for (Student s : students) {
            totalGpa += s.getGpa();
            if (s.getGpa() >= 3.0) {
                goodGpa.add(s);
            } else {
                badGpa.add(s);
            }
        }

        double average = students.isEmpty() ? 0 : totalGpa / students.size();

        view.printStudentList(students);
        view.printGpaStats(average, goodGpa, badGpa);
    }
}
