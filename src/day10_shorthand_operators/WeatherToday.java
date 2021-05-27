package day10_shorthand_operators;
import java.util.Scanner;

public class WeatherToday {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How is the weather?");

                       //= next(); JUST ONE WORD
        String weather = scan.nextLine();  // ALL WORDS

        System.out.println(weather +" - is a nice day today! Do you want to " +
                "go to park?");
        String answer = scan.next();
        System.out.println("Great Let's go");




    }
}
