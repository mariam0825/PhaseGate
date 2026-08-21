public class prime{
    public static void main(String[]args){



System.out.println ("The number  is: "+ primeNumber(5) + " a Prime number.");


}
    public static boolean primeNumber (int number ){

    if (number < 2) {
            return false; 
        }
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                return false; 
            }
        }
        return true; 
    }
 
    
        

            }


