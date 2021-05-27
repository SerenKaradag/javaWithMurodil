package day24_loops;

import java.util.*;



public class GueesTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
       // System.out.println();

            int secretNumber = randomNum.nextInt(101);
            int gueessingNumber = 0;
            do{
                System.out.println("Guess the secret number");
                gueessingNumber = scan.nextInt();
                if(gueessingNumber > secretNumber){
                    System.out.println("wrong, your number is too small");
                }else{
                    System.out.println("wrong, your number is too large");
                }
            }while(gueessingNumber != secretNumber);


    }
}
