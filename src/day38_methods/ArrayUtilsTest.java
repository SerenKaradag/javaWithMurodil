package day38_methods;

import java.util.Arrays;

//import java.util.Scanner;
public class ArrayUtilsTest {


    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
          int[] nums= {1,2,3,4,5};

        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{23,45,65,78,98,32,12,54,9896,321});

     int[] num2 = {4,1,5,8};
    /** int num = 5;
     boolean found = false;

     for(int each : nums){
         if(each == num){
             found = true;
             break;
         }
     }
     System.out.println("found = " + found);
     CHECKING AN OTHER CLASS AND ASSIGNING TO HERE
     **/

        System.out.println(" 5 - found + " + ArrayUtils.contains(num2, 5));




    }
}
