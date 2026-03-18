import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public StudentService() {
        students.add(new PerformanceStudent(101, "Keerthi", "BCA", 90));
        students.add(new PerformanceStudent(102, "Ashvitha", "BSc CS", 78));
        students.add(new PerformanceStudent(103, "Vaishnavi", "BCom", 55));
        students.add(new PerformanceStudent(104, "Nandhu", "BBA", 55));
    }

    public void addStudent() {
        try {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            students.add(new PerformanceStudent(id, name, dept, marks));
            System.out.println("Student Added Successfully!");
        } catch (Exception e) {
            System.out.println("Invalid Input!");
            sc.nextLine();
        }
    }

    public void viewStudents() {
        System.out.println("ID\tName\tDept\tMarks\tGrade");
        for (Student s : students) {
            s.display();
        }
    }

    public void deleteStudent() {
        try {
            System.out.print("Enter Student ID to delete: ");
            int id = sc.nextInt();

            boolean removed = students.removeIf(s -> s.getId() == id);
            if (!removed) {
                throw new Exception("Student not found!");
            }
            System.out.println("Student Deleted Successfully!");

        } catch (Exception e) {
            System.out.println("Error!");
            sc.nextLine();
        }
    }

    public void updateStudent() {
        try {
            System.out.print("Enter Student ID to update: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            boolean found = false;

            for (Student s : students) {
                if (s.getId() == id) {

                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double marks = sc.nextDouble();

                    // Update values
                    s.setName(name);
                    s.setDepartment(dept);
                    s.setMarks(marks);

                    System.out.println("Student Updated Successfully!");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found!");
            }

        } catch (Exception e) {
            System.out.println("Invalid Input!");
            sc.nextLine();
        }
    }

}