package day24_loops;
import java.util.*;
public class DoWhileLoop1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode;
        do{
            System.out.println("Enter pincode");
            pinCode = scan.nextInt();

        }while(secretPinCode != pinCode);
    }
}
