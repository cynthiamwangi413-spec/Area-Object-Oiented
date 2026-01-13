import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
    static ArrayList<BankAccount> accounts = new ArrayList<>();


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;


        do {
            System.out.println("/n=====BANK MENU ======");
            System.out.println("1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Check Balance");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            scanner.nextInt();

            choice =scanner.nextInt();


            switch (choice) {
                case 1 -> createAccount();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> checkBalance();
                case 5 -> System.out.println("thank you for using the Bank");
                default -> System.out.println("Invalid choice!Try again");


            }
        }

        while (choice != 5);
    }

    static void createAccount() {
        System.out.println("Enter name:");
        scanner.nextLine();
        String Name = scanner.nextLine();
        System.out.println("Enter account number:");
        scanner.nextInt();
        System.out.println("Enter initial balance:");
        sc.nextDouble();

        AccountNumber.add(new AccountNumber(Name,AccountNumber,Balance));
        System.out.println("Account created successfully");
    }
    static Account findAccount(String AccountNumber) {
        for (Account acc : BankSystem.accounts) {
            if (acc.accountNumber.equals(accNumber)) ;
            return acc;
        }
    }}


















