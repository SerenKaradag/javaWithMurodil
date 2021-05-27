package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {

        String source ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklm" +
                "nopqrstuvwxyz0123456789_!@#$%^&*";  // 75 chracter
        Random random = new Random();

        String password = "";


        for(int i = 1; i <=8; i++){
            int index = random.nextInt(71); // 0 - 70
            System.out.print(source.charAt(index));
            //source.substring(index, index+1)
           // System.out.println(random.nextInt(source.length()));
            password += source.charAt(index);
        }
        System.out.println();

        System.out.println("Your password= " + password);
    }
}
