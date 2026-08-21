public class reversestring{

    public static void main(String [] args){


    System.out.println(reverse("Mariam"));
}

public static String reverse (String word){
       String reverse = "";

    for(int index = word.length() -1; index >= 0; index--){
        
       reverse += word.charAt(index);
               
    
        }   

    return reverse;

}

        

}

