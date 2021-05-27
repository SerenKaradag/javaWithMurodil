package Practice;
import java.util.Scanner;
public class CamelCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int words = 1;


        if(str.isEmpty()){
            words = 0;
        }for(int i = 0; i <str.length(); i++){


            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                words++;

            }
        }
        System.out.println("words = " + words);
    }
}
