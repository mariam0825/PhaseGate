public class integernumber{

    public static void main (String[]args){

    int number = 1234;

    System.out.print( revsersenumber (number));

}


    public static int revsersenumber (int number){
        int reverse = 0;
        int  digit = 0;

    while(number > 0){
        
        digit = number % 10;

        reverse = reverse *10 + digit;
        
       number= number/10;
 
  }

    return reverse;
}

}



