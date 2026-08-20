
import java.util.Scanner;
public class bankaccount{
    public static void main(String []args){
    Scanner.input = new Scanner(System.out);   
    
    double balance = 1000; 
    
    while (true){
    
    System.out.println(
""" ----Welcome to Transaction log App----
        1. Deposit
        2. Withdraw
        3. view transaction history
        4.  Exit

        """ )
    
    System.out.println("Select option : ");
    int option = input.nextInt() ;   
    
    switch(option){
            case 1 :
                System.out.print("Enter amount = ");
                double deposited = input.nextInt();
            if (deposited > 0 ){
          
                double currentBalance = balance + deposited;  
             System.out.println("Deposited # "+ deposited + "|" +"New Balance # " + currentBalance);

             }else {

            System.out.println("Deposited # "+ deposited + "|" +"New Balance # " + balance);

             }
            break;
        case 2:
              System.out.print("Enter withdraw amount = ");
               double withdrawAmount = input.nextInt();
            if (withdrawAmount > 0 ){

                double withdrawBalance = balance - withdrawAmount ;
            
            System.out.println("Deposited # "+ withdrawAmount + "|" +"New Balance # " + withdrawBalance);
            }
            else{

            System.out.println("Deposited # "+ withdrawAmount + "|" +"New Balance # " + balance);

             }break;

        case 3 :
        





   

    }

    }
