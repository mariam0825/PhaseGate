

public class addDigit{
    public static void main (String []args){

    int number = 38;

    System.out.print(add(number));

}
    public static int add (int number){
    int sum = 0;
 
        while (number > 0) {
            int digit = number % 10;  
            
                sum+=digit; 
            number /= 10;               
        }
        return sum;
    }
    
    }
    




