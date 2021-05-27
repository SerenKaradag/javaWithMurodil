package day29_nestedloop_arrays;

public class StartsNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int n = 1; n < 10; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int outher = 1; outher <=10; outher++){
            for (int inner =1; inner <= outher;inner++){
                System.out.print("* ");
            }
            System.out.println();
        }



        for(int outher = 1; outher <=10; outher++){
            for (int inner =10; inner >= outher;inner--){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
