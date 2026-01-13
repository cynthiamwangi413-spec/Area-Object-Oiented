import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter a number");
            int x= scanner.nextInt();
            System.out.println("What number do you wish to divide with");
            int y= scanner.nextInt();
            int z=x/y;
            System.out.println("Results:"+z);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide any number by zero");
        }
        catch(InputMismatchException e){
            System.out.println("You've made an error");
        }

    }
}