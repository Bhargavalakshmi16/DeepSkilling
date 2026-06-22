package MVC;

public class Main {

    public static void main(String[] args) {

        Student student =
                new Student(
                        "Bhargavi",
                        101,
                        "A"
                );

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(
                        student,
                        view
                );

        controller.updateView();

        System.out.println();

        controller.setStudentName("Lakshmi");

        controller.updateView();
    }
}