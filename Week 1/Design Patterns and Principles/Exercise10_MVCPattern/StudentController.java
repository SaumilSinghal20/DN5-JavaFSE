public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student m, StudentView v) {
        this.model = m;
        this.view = v;
    }

    public void setStudentName(String n) {
        model.setName(n);
    }
    
    public String getStudentName() {
        return model.getName();
    }
    
    public void setStudentGrade(String g) {
        model.setGrade(g);
    }

    public void updateView() {
        view.displayStudentDetails(model.getId(), model.getName(), model.getGrade());
    }
}
