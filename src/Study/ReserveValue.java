package Study;
import java.util.Scanner;
public class ReserveValue {
    public static void main(String[] args) {


        String word = "I love java";
        String reverseWord = "";
        String secondWord = word.substring(word.indexOf(" ")+1, word.lastIndexOf(" "));
        System.out.println("secondWord = " + secondWord);
        for (int i =word.lastIndexOf(" ")-1; i > word.indexOf(" "); i--){
            reverseWord += word.charAt(i);
        }
        System.out.println(word.replace(secondWord , reverseWord));


    }
}
