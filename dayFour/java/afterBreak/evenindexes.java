import java.util.Scanner;

public class evenindexes{

    public static void main (String []args){

    Scanner input = new Scanner(System.in);

    int sum = 0;
    
    for(int index = 1 ; index <=10; index ++){
    
        if(index % 2 == 0){
       
    System.out.print("Enter Score = ");
     int score = input.nextInt();
        sum +=score;
    }
}
System.out.println("The total sum of number is : "+ sum);
}


}
