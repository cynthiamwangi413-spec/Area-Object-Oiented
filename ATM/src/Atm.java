import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atm {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       double balance  = 1000;
       int choice = 0;


       while(choice !=4) {

           System.out.println("Check balance");
           System.out.println("Deposit");
           System.out.println("Withdraw");
           System.out.println("Exit");
           System.out.println("Enter your choice");

           choice = scanner.nextInt();

           switch(choice){
               case 1:
                   System.out.println("Your balance is" + balance);
                   break;
               case 2:
                   System.out.println("enter amount to deposit");
                   double deposit = scanner.nextDouble();
                   balance += deposit;
                   System.out.println("Deposit succesful!New balance:" + balance);
                   break;
               case 3:
                   System.out.println("Enter amount to withdraw");
                   double withdraw = scanner.nextDouble();
                   if (withdraw <= balance) {
                       balance -= withdraw;

                       System.out.println("withdraw succesful!New balance:" + balance);
                   } else {
                       System.out.println("insufficient funds!");

                   }
                   break;
               case 4:
                   System.out.println("Thank you for using the ATM.Goodbye!");
                   break;
               default:
                   System.out.println("invalid choice!Try again.");}

           }

       }
    }
