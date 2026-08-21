import java.util.ArrayList;
import java.util.Scanner;
public class BankAccountMain{
    public static void main(String []args){
    Scanner input = new Scanner(System.in);   
    
    double balance = 1000; 

    ArrayList<String> transactions = new ArrayList<>();
    
    while (true){
    
  System.out.println("---- Welcome to Transaction Log App ----");
  System.out.println("1. Deposit");
  System.out.println("2. Withdraw");
  System.out.println("3. View Transaction History");
  System.out.println("4. Exit");

    System.out.println("Select option : ");
    int option = input.nextInt() ;   
    
    switch(option){
            case 1 :
                System.out.print("Enter amount = ");
                double deposited = input.nextInt();

              // balance = BankAccount.deposit(balance, deposited, transactions);

            
    
            if (deposited > 0) {

                double Newbalance = balance +deposited;
                        System.out.println(" The amount Deposited is : ₦" + deposited + " | New Balance: ₦" + Newbalance );
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }

                    break;
           
        case 2:
              System.out.print("Enter withdraw amount = ");
               double withdrawAmount = input.nextInt();

           //balance = BankAccount.withdraw(balance, withdrawAmount, transactions);
                double Withbalance = Newbalance - withdrawAmount;
        
            if (withdrawAmount > 0 && withdrawAmount <= balance) {

                System.out.println(" The amount Withdraw is : ₦" + withdrawAmount + " | New Balance: ₦" + balance );

                    } else {

                System.out.println("Withdrawal failed: insufficient funds");
                    }

        case 3 :
        
             // BankAccount.showTransactions(transactions);


                    break;

        case 4:
            System.out.println("Final Balance: ₦" + balance);
              //  BankAccount.showTransactions(transactions);     

                    System.out.println( "Thank you for using Transaction Log App!");

                    input.close();

                    return;


            default:

                    System.out.println("Invalid option. Please try again.");

    }

    }

    }

    }
