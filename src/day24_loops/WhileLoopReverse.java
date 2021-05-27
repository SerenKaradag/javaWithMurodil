package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {

        int count = 5;
        while (count >= 0) {
            System.out.println("count = " + count);
            count--;
        }


        /**
         * read each message 1 by 1 until you have 0 unread sms
         */
        int unreadSMS = 10;
        System.out.println("i have total "   + unreadSMS);

        while(unreadSMS >= 0){
            System.out.println("Reading SMS : " + unreadSMS);
            unreadSMS--;
        }

    }
}