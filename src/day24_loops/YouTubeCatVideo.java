package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;

        while(seconds < 117){
            System.out.println("watching Youtube video :" + seconds);
            seconds++;
            Thread.sleep(10);
        }
        System.out.println("Finished watching cat video, lets start another one");


        int count = 5;
         while(count <= 0){
             System.out.println("count = " + count);
             count--;
         }
    }
}
