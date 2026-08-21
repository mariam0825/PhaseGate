public class grade{

    public static void main(String[]args){

    System.out.println("The average of the three score grade is " + gradeScore(70, 65,88));


}
    public static int gradeScore (int scoreOne , int scoreTwo, int scoreThree){

    int average = scoreOne + scoreTwo + scoreThree / 3;

    if(90 <= average <=100){

        return "A" ;  
   }else if(80 <= average < 90){
        return "B";

    }else if (70 <= average < 80) {
        return "c";

    }else if (60 <= average < 70){
        return "D";

    }else if (0 <= average < 60){
        return "F";


    }




    }




}
