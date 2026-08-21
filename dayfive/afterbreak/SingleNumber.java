public class SingleNumber{
    public static void main (String []args){

    int[] number = {2,2,1};

    System.out.print(isSingle(number));

}
    public static int isSingle(int[] number){
    int value = number[0];
    int count = 0;
    
    for(int index = 0; index < number.length; index++){
        if (number[index] == number[value]){
            count++;   
    }
     
   }

    return count;

}




}
