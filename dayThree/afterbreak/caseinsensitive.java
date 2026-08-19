public class caseinsensitive{

    public static void main(String[]args){


System.out.print(countDistinctcase("a111BAcb"));
}
    public static int countDistinctcase (String word){
          
            int count = 0;
        for (int index = 0; index < word.length(); index++) {
              if (count == index ){
            String text = word.charAt[index];
             word.charAt[index] = Character.equalIgnoreCase(text);
                count++;
            }
        }
        
        return count;
    

}

}
