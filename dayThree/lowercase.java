public class Lowercase {
    public static void main(String[] args) {
        System.out.println(countword("Mariam"));
 }

    public static int countword(String word) {
        int count = 0;
        for (int index = 0; index < word.length(); index++) {
            char text = word.charAt(index);
            if (Character.isLowerCase(text)) {
                count++;
            }
        }
        return count;
    
}

    }

