import java.util.Scanner;

public class sum{

    public static void main (String []args){

    Scanner input = new Scanner(System.in);

    int sum = 0;
    
    for(int index = 1 ; index <=10; index ++){
       
    System.out.print("Enter Score = ");
     int score = input.nextInt();
        sum +=score;

}
System.out.println("The total sum of number is : "+ sum);
}






}

