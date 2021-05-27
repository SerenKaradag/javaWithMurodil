package day09_scanner_practice;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("##########  F to C CONVERTER PROGRAM ########");
        System.out.println("Enter Fahrenheit Value");
        double fahrenhaitValue = input.nextDouble();
        double celsiusValue = ( fahrenhaitValue - 32) * 5/ 9;
        System.out.println(fahrenhaitValue + "F in C: " +celsiusValue );

    }
}
