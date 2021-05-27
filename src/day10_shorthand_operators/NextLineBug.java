package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month:");
        double rent = scan.nextDouble();


        scan.nextLine(); // add empty line when its bug



        String month = scan.nextLine();
        // fix the bug.WORKAROUND
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);



    }
}
