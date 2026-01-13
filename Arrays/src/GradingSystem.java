import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//
public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter students name");
        String Name = scanner.nextLine();

        System.out.println("Enter students marks");
        int Marks = scanner.nextInt();

        //grades
        int totalaverage = 100;
        if(totalaverage>=80 && totalaverage<=100){
        System.out.println("A");}
        else if(totalaverage>=50 && totalaverage<=70){
        System.out.println("B");}
        else if(totalaverage>=30 && totalaverage<=50){
        System.out.println("C");}
        else{
        System.out.println("D");}

        //use a HashMap to store a Name(String) and Marks(integer)
        Map<String,Integer> studentMarks = new HashMap<>();
        studentMarks.put("Koi",20);
        studentMarks.put("Sam",60);
        studentMarks.put("Kyle",95);
        studentMarks.put("Josee",05);


        System.out.println("How many students do you want to enter");
        int number = scanner.nextInt();

        //STUDENT DETAILS
        int studentId=2;
        switch (studentId){
            case 1:
                System.out.println("Student:Koi , Marks:20");
                break;
            case 2:
                System.out.println("Student:Sam , Marks:60");


                break;
            case 3:
                System.out.println("Student:Kyle , Marks:95");

                break;
            default:
                System.out.println("Student:Josee , Marks:05");

                break;}


        System.out.println("\"student:Josee,  Marks:05 ,Grade:D\"");
        System.out.println("\"Student:Koi , Marks:20 ,Grade:C\"");
        System.out.println("\"Student:Sam , Marks:60 , Grade:B\"");
        System.out.println("\"Student:Kyle , Marks:95, Grade:A\"");
        }





        }













