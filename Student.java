public class Student {

    private int id;
    private String name;
    private String department;
    private double marks;

    public Student(int id, String name, String department, double marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String calculateGrade() {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "Fail";
    }

    public String calculateGrade(double marks) {
        if (marks >= 90) return "A+";
        else return calculateGrade();
    }


    public void display() {
        System.out.println(id + "\t" + name + "\t" + department + "\t" + marks + "\t" + calculateGrade(marks));
    }
}