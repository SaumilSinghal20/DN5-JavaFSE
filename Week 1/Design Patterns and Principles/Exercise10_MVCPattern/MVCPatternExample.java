public class MVCPatternExample {
    public static void main(String[] args) {
        Student s = new Student("101", "Mike", "A");
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(s, view);
        
        controller.updateView();
        
        // updating model via controller
        controller.setStudentName("Mike Johnson");
        controller.setStudentGrade("A+");
        
        System.out.println("\nAfter updates:");
        controller.updateView();
    }
}
