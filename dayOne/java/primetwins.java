public class primetwins{
    public static void main(String[]args){

    int number = 100;

    for(int count = 2; count <= number; count ++){
        if (istwinPrime(count) && istwinPrime(count + 2)){
        System.out.println(count + " " + (count + 2));
       
            }
        }

    }
    public static boolean istwinPrime(int number){

        if(number < 2){
            return false;
        }

        for(int index = 2; index < number;index++ ){
            if (number % index == 0){
                return false;
            }
        }
            return true;
        
}

    


}
