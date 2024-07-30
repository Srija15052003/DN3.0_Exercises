public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("1", "John Doe", "A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller to handle the model and view
        StudentController controller = new StudentController(student, view);

        // Update and display student details
        controller.updateView();

        // Update model data
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
