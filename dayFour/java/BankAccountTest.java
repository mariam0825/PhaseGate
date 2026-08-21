import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class BankAccountTest{

    @Test

   public void testThtatwhenMoneyisDepoisted(){

    double balance = 1000;
    
    double deposited = 5000;
    
    ArrayList<String> transactions = new ArrayList<>();

    double  actualResult = balance + deposited;

   double expectedResult = BankAccount.deposit(balance, deposited,transactions);

    assertEquals(actualResult, expectedResult);

    }

 @ Test

    public void testThatwhentheMoneyislessThanZero(){

     double balance = 1000;

     double deposited = -1000;
    
    ArrayList<String> transactions = new ArrayList<>();            
    
     double actualResult = balance;

     double expectedResult = BankAccount.deposit(balance, deposited,transactions);

    assertEquals(actualResult, expectedResult);




}
    @ Test
public void testthatWheniWithdrawmoney(){

    double balance = 6000;

    double withdrawAmount = 2000;

    ArrayList<String> transactions = new ArrayList<>();
    
    double actualResult = balance - withdrawAmount;

    double expectedResult = BankAccount.withdraw (balance, withdrawAmount, transactions);
    
    assertEquals(actualResult, expectedResult);
    

}
    
@ Test
public void testThatYouCannotWithDrawanyNegativeValue(){

    double balance = 6000;
    
    double withdrawAmount = -1000;
    
    ArrayList<String> transactions = new ArrayList<>();
    
    double actualResult = balance;
    
    double expectedResult = BankAccount.withdraw(balance, withdrawAmount, transactions);
    
    assertEquals(actualResult, expectedResult);

}
    @ Test
 public void testThatShowsAllTransactionRecorded(){

    double balance = 6000;
    double withdrawAmount = 2000;

    ArrayList<String> transactions = new ArrayList<>();

    BankAccount.withdraw(balance, withdrawAmount, transactions);

    assertEquals("Withdrew: ₦2000.0 | New Balance: ₦4000.0",transactions.get(0));


}

@Test
public void testThatWithdrawalFailsWhenThereIsNotEnoughMoney() {

    double balance = 1000;
    double withdrawAmount = 5000;

    ArrayList<String> transactions = new ArrayList<>();

    BankAccount.withdraw(balance, withdrawAmount, transactions);

    assertEquals("Withdrawal failed: insufficient funds" ,transactions.get(0));
}

}














    
