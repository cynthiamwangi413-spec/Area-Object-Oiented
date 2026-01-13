import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //patients details
        System.out.println("Enter students name");
        String Scanner = scanner.nextLine();
        System.out.println("Area of residence");
        String Area = scanner.nextLine();
        System.out.println("Age");
        int Age = scanner.nextInt();
        System.out.println("Gender");
        String Gender = scanner.next();
        System.out.println("Mobile number");
        double Number = scanner.nextDouble();
        System.out.println("Weight" + "kg");
        double Weight = scanner.nextDouble();
        System.out.println("Height" + "m");
        double Height = scanner.nextDouble();




        //BMI=Weight(kg);
        int totalWeight = 39;
        if (totalWeight >= 0 && totalWeight <= 18.5) {
            System.out.println("Underweight");
        } else if (totalWeight >= 18.5 && totalWeight <= 24.9) {
            System.out.println("Healthy");
        } else if (totalWeight >= 25 && totalWeight <= 29.9) {
            System.out.println("Overweight");
        } else if (totalWeight >= 30 && totalWeight <= 39.9) {
            System.out.println("Obese");
        } else {
            System.out.println("Severe obese");
        }

    }
}
