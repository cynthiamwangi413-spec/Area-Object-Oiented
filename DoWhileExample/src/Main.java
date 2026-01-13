import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;
        while (continueInput) {
            System.out.println("Enter students name");
            String name = scanner.nextLine();

            System.out.println("Enter kiswahili marks:");
            double kiswahiliMarks = scanner.nextDouble();

            System.out.println("Enter english marks:");
            double englishMarks = scanner.nextDouble();

            double averageMarks = (kiswahiliMarks + englishMarks);

            System.out.println("\n student details");
            System.out.println("name" + name);
            System.out.println("kiswahiliMarks"   + kiswahiliMarks);
            System.out.println("englishMarks" + englishMarks);
            System.out.println("averageMarks" + averageMarks);

            System.out.println("\nDo you want to continue?(yes/no)");
            scanner.nextLine();
            String response = scanner.nextLine().toLowerCase();

        }

    }
}