package MVC.Model;

import MVC.Student.Student;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }
}
