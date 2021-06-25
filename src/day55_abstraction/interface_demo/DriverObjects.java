package day55_abstraction.interface_demo;

public class DriverObjects {

    public static void main(String[] args) {


        /**
         *  WebDriver  driver = new WebDriver();  // WE CAN NOT CREATE OBJECT OF INTERFACE
         */

        ChromeDriver driver1 = new ChromeDriver();   // EVERY NEW KEYWORD CONSTRUCTOR IS RUNNING
        FirefoxDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new ChromeDriver();


        driver1.get("htttps://www.google.com");
        driver1.findElement("//input[@name='a']");
        System.out.println("Title = " +driver1.getTitle());

    }
}
