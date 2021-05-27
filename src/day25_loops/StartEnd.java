package day25_loops;
import java.util.Scanner;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        for (start = start; start <= end; start++){
            System.out.print(start + " ");

        }
        if (start > end){
            System.out.println("Reverse numbering is not supported");
        }


        int starts = 5;
        int ends = 10;
        for(int i = start; i <= end; i++){
            System.out.println(i + "");
        }













    }
}
