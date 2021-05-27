package Study;
import java.util.*;
public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scan.nextInt();

        for(int i = 1; i <= number; i++){

           if(i % 3 == 0 && i % 5 == 0){
               System.out.println(i);
           }



        }


    }
}
