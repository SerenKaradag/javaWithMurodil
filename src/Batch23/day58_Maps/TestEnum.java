package Batch23.day58_Maps;

public class TestEnum {
    public static void main(String[] args) {

      //  String browser = "Cydeo";  //if you use that one we CAN create CASE EMPTY

        Browser browser = Browser.chrome;// if you use that one we can NOT create CASE EMPTY

        switch(browser){

            case firefox:
                System.out.println("Firfox driver is selected");
            case edge:
                System.out.println("edge driver is selected");
            case safari:
                System.out.println("safari driver is selected");
            case opera:
                System.out.println("opera driver is selected");

            default:
                System.out.println("Chrome driver is selected");
        }


        System.out.println("----------------------------------");

     //   String level = "Java";

        Level level = Level.Low; // we can assign just from ENUM

    }
}
