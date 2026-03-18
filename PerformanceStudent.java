public class PerformanceStudent extends Student {

    public PerformanceStudent(int id, String name, String department, double marks) {
        super(id, name, department, marks);
    }

    @Override
    public String calculateGrade() {
        if (getMarks() >= 95)
            return "A++";
        else
            return super.calculateGrade();
    }
}