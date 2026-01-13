import java.util.ArrayList;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students do you want to enter");
        int numberOfStudents = scanner.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String Name = scanner.nextLine();

            System.out.println("Enter students name:");
            String name = scanner.nextLine();

            System.out.println("Enter marks for" + Name + ":");
            int Marks = scanner.nextInt();


            students.add(new Student(Name, Marks));
        }
        System.out.println("/n---Students results---");
        for (Student s : students) {
            String grade = calculateGrade(s.Marks);
            System.out.println((s.Name + "/Marks:" + s.Marks + "/" + grade ));
        }
    }

    public static String calculateGrade(int marks) {
        if (marks >= 80 && marks <= 100) {
            return "A";
        } else if (marks >= 50) {
            return "B";
        } else if (marks >= 30) {
            return "C";
        } else {
            return "D";
        }
    }
}
