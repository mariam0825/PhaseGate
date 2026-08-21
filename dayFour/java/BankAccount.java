public class BankAccount{

    public static void main(String []args){
    
    double balance = 1000; 
    double deposited = 5000; 
    double withdrawAmount = 2000;
    
    }

    public static double deposit (double balance , double deposited){
        
        
        if (deposited > 0 ){
          
         double currentBalance = balance + deposited;  
            return currentBalance;

        }else {

            return balance;

        }
    }

   public static double withdraw (double withdrawAmount , double balance){

    if (withdrawAmount > 0 ){

    double withdrawBalance = balance - withdrawAmount ;
            
        return withdrawBalance;
    }
    else{

        return balance;

        }


    } 
    
public static double transcation (double deposit, double withdraw){

        String empty = " ";

    if (deposit > 0 ){

    }





}

    

}
