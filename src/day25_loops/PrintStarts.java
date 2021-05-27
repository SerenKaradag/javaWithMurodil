package day25_loops;

public class PrintStarts {
    public static void main(String[] args) {
        for(int stars = 1 ; stars <= 15; stars++){
            System.out.println(" ✯ ");
    }

        String myStarts = "";

        for(int star = 0; star <=5; star++){
            // myStarts = myStarts + "*";
            myStarts += "* ";
            System.out.println("my stars = "+ myStarts);

        }






    }
}
