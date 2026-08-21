import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class addDigitTest{

    @Test

   public void testThesumofnumber(){

   int  number =38;
    
   int  actualResult = 11;

   int expectedResult =addDigitTest.add(number);

    assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testForSingleDigit(){

    int number = {2,2,1};

    int actualAnswer = 1;

    int expectedAnswer = SingleNumber.isSingle(number);
    
    assertEquals(actualAnswer , expectedAnswer);


    }

  //  @Test
    

}
