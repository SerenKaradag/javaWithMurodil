package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int outher = 1; outher < 10; outher++){
            for(int inner =1; inner <= 10; inner++){
                System.out.print(outher * inner + "\t");

            }
            System.out.println();
        }
    }
}
