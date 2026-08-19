import java.util.Scanner;

public class divisors{

    public static void main (String[]arg){
    Scanner input = new Scanner(System. in);
    
System.out.print("Enter number = ");

    int number = input.nextInt();


    for(int index = 1; index <= 100; index ++){
    
        if(index % number == 0){

            System.out.println(index);
        
        }
        

}


}





}
