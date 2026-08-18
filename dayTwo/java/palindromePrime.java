public class palindromePrime{

    public static void main(String []args){

    int number = 1,2,3,4,5,6,7,8;

    int digit = 0;

    int reverse = 0;

    int divisor = 0;

    for(int index = 0; index <= number.length ; index ++){
      for(int count = 0 ; count <= number.length; count ++){

        if(index % count == 0){
    
        }

        if (number == 2){


        }
        while(number > 0){
        
        digit = number % 10;

        reverse = reverse + digit;
        
       number= number/10;
 

     }
        divisor = reverse * reverse;

    }
}   

    System.out.print(divisor);


}



}
