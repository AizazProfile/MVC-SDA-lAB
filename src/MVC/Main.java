package MVC;

import MVC.Controller.Controller;
import MVC.Model.Model;
import MVC.View.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.addStudents();
        controller.updateView();
    }
}
