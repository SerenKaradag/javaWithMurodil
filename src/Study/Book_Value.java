package Study;
import java.util.*;
public class Book_Value {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the book text :");
        String bookText =scan.nextLine();
        int chapterCount = 0;

        for(int i = 0; i < bookText.length()-6; i++){


           if( bookText.substring(i, i+7).equalsIgnoreCase("chapter")){
               chapterCount++;
           }

        }
        System.out.println(chapterCount + "Chapters -> value of the book :" + chapterCount * 10 );

    }
}
