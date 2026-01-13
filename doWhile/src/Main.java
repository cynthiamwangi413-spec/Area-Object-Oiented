import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int average=0;


         do {
             System.out.println("STUDENT DETAIL......!");
             System.out.println("Enter student name");
             String name = scanner.nextLine();

             System.out.println("Enter english score");
             int english = scanner.nextInt();

             System.out.println("Enter kiswahili score");
             int kiswahili = scanner.nextInt();

             average = english + kiswahili;
             System.out.println("Average score:" + average);}

             while (average != 4);{

             }

         }

    }

