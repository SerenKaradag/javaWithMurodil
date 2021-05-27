package day26_loops;

public class PrintsChars {
    public static void main(String[] args) {
        String word = "selenium";

        for(int i = 0; i < word.length(); i++){
            System.out.println(i + " - "+word.charAt(i));

        }
        word = "Seren"; // int i = 3 // int i = word.length() - 1;
       for(int i =4; i>= 0; i--){
           System.out.print(word.charAt(i));
       }







        /**
         * Long way without loop.
         *  System.out.println(word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        */





    }
}
