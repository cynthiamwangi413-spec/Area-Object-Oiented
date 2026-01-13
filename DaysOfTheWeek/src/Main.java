import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 2;

        switch(day){
            case 1:
                day = 1;
                System.out.println("Monday");
                break;
            case 2:
                day = 2;
                System.out.println("Tuesday");
                break;
            case 3:
                day = 3;
                System.out.println("Wenseday");
                break;
            case 4:
                day = 4;
                System.out.println("Thursday");
                break;
            case 5:
                day = 5;
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}