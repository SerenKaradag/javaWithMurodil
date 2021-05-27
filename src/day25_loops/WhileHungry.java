package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 5;
        //while(isHungry || bananas != countToFull)

        while (isHungry) {
            System.out.println("eat banana 1");
            bananas++;
          //  isHungry = bananas == countToFull? false: true;
            if (bananas == countToFull) {
                isHungry = false;
           }
        }
        System.out.println("HAd enough bananas, lets back to studying");




        }


    }

