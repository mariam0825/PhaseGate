
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class BankAccountTest{

    @Test

   public void testThtatwhenMoneyisDepoisted(){

    double balance = 1000;
    
    double deposited = 5000;

    double  actualResult = balance + deposited;

   double expectedResult = BankAccount.deposit(balance, deposited);

    assertEquals(actualResult, expectedResult);

    }

 @ Test

    public void testThatwhentheMoneyislessThanZero(){

     double balance = 1000;

     double deposited = -1000;
        
     double actualResult = balance;

     double expectedResult = BankAccount.deposit(balance, deposited);

    assertEquals(actualResult, expectedResult);




}
    @ Test
public void testthatWheniWithdrawmoney(){

    double balance = 6000;

    double withdrawAmount = 2000;

    double actualResult = balance - withdrawAmount;

    double expectedResult = BankAccount.withdraw (balance, withdrawAmount);
    
    assertEquals(actualResult, expectedResult);
    

}
    
@ Test
public void testThatYouCannotWithDrawanyNegativeValue(){

    double balance = 6000;
    
    double withdrawAmount = -1000;
    
    double actualResult = balance;
    
    double expectedResult = BankAccount.withdraw(balance, withdrawAmount);
    
    assertEquals(actualResult, expectedResult);

}
  //  @ Test
//public void testThatShowsAllTransactionRecorded(){

    










}

    
