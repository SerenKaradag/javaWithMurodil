package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        /**
         * 1) word.substring(startIndex, endIndex)
         */
        System.out.println(word.substring(0, 3));
        System.out.println(word.substring(0, 7));
        System.out.println(word.substring(5, 7));

        /**
         * 2) substring(startIndex) - it will read from start until end
         */

        System.out.println(word.substring(8));
        System.out.println(word.substring(5));
        System.out.println(word.substring(1));



    }
}
