public class BankAccount{
    String Name;
    String AccountNumber;
    double balance;

   BankAccount(String Name,String AccountNumber,double balance){
       this.Name = Name;
       this.AccountNumber = AccountNumber;
       this.balance = balance;

    }
    void deposit(double amount){
       balance += amount;
        System.out.println("Deposited"+ amount + "New balance:" + balance);
    }
     void withdraw(double amount) {
         if (amount > balance) {

         } else {
             balance -= amount;
             System.out.println("withdraw" + amount + "New balance:" + balance);
         }
     }
           void display(){
             System.out.println("Name:" + Name);
             System.out.println("AccountNumber:" + AccountNumber);
             System.out.println("balance:" + balance);
         }
}





