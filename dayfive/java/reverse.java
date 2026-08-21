public class reverse{
    public static void main(String[]args){



System.out.println ("The reverse is: "+ reverse(5438) );


}
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;   
            reversed = reversed * 10 + digit;  
            number /= 10;               
        }
        return reversed;
    }
    
    }
    
          
    
 
