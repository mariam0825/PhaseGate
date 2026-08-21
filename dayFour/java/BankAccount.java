
import java.util.ArrayList;

public class BankAccount{

    public static void main(String []args){
    
    double balance = 1000; 
    double deposited = 5000; 
    double withdrawAmount = 2000;
    
    }

    public static double deposit(double balance, double deposited, ArrayList<String> transactions) {

    if (deposited > 0) {

        balance = balance + deposited;

        transactions.add("Deposited: ₦" + deposited + " | New Balance: ₦" + balance );

        return balance;

    } else {

        return balance;
    }
    }


   public static double withdraw(double balance, double withdrawAmount, ArrayList<String> transactions) {

    if (withdrawAmount > 0 && withdrawAmount <= balance) {

        balance = balance - withdrawAmount;

        transactions.add(" You Withdraw: ₦" + withdrawAmount + " | New Balance: ₦" +  balance);

        return balance;

    } else {

        transactions.add("Withdrawal failed: insufficient funds");

        return balance;
    }
}

    
    public static void showCurrentTransactions(ArrayList<String> transactions) {

    if (transactions.isEmpty()) {

        System.out.println("No transactions done so far.");

    } else {

        System.out.println("Transactions Recently Done : ");

        for (int index = 0; index < transactions.size(); index++) {

            System.out.println((index + 1) + ". " + transactions.get(index));
        }
    }
   }


    

}
