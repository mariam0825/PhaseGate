public class grade{

    public static void main(String[]args){

    System.out.println("The average of the three score grade is " + gradeScore(70, 65,88));


}
    public static String gradeScore (int scoreOne , int scoreTwo, int scoreThree){

    int average = scoreOne + scoreTwo + scoreThree / 3;

       if (average >= 90) {
            return("A");
        }else {
          if (average >= 80) {
            return("B");
        }
        else {
        if (average >= 70) {
           return  ("C");
        }
         else {
            if (average >= 60) {
           return ("D");
        }
        else {
           return ("F");
}
}
}

}

}
}
