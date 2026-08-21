import java.util.Scanner;

public class evenindexes{

    public static void main (String []args){

    Scanner input = new Scanner(System.in);

    int sum = 0;
    int average = 0;
    for(int index = 1 ; index <=10; index ++){
       
    System.out.print("Enter Score = ");
     int score = input.nextInt();
         if(score % 2 == 0){
        sum +=score;
    average = sum/5;
    }

}
System.out.println("The Total sum of number is : " + sum);

System.out.println("The total average of number is : "+ average);
}


}
