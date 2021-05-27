package day07_arithmetic_operators_casting;

public class DivisionProblem {
     public static void main(String[] args){
         System.out.println(10 / 3);
         System.out.println(5 / 2);

         int num1 = 40;
         int num2 = 15;
         System.out.println(num1 / num2);

         System.out.println(5.0 / 2.0);
         System.out.println(5.0 / 2);
         double d1 = 12.0;
         double d2 = 5.0;
         System.out.println (d1 / d2);

         int count = 100;
         double dCount = 30.0;
         System.out.println (count/dCount);



          // PRIMITIVE CASTING
         //PRIMITIVE CONVERSION:
          // INT IS LARGER DATA TYPE THAN BYTE. EVEN THOUGH THE VALUE IS ONLY 4.
        // int n1 = 4;
         // byte b1 = n1;


         int n1 = 4;
         byte b1 = (byte)n1;

         //Now the above line(byte)n1,
         // will CAST/CONVERT n1 to byte. then assign the value
     }
}
