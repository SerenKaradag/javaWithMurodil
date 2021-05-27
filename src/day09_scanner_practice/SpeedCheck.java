package day09_scanner_practice;

public class SpeedCheck {
    public static void main(String[] args) {

        int speedLimit = 55;
        int currentSpeed = 40;
        int overTheLimit = currentSpeed - speedLimit;

        System.out.println("You are driving " + overTheLimit + " mph over limit.Slow Down!");

    }
}
