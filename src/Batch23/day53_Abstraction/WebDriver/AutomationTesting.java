package Batch23.day53_Abstraction.WebDriver;

public class AutomationTesting {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("www.google.com");
        driver.findElement("xpath");
        driver.getTitle();
        driver.quit();


        System.out.println("----------------------------------------------");

        FireFoxDriver driver2 = new FireFoxDriver();
        driver.get("www.google.com");
        driver.findElement("xpath");
        driver.getTitle();
        driver.quit();


        WebDriver driver5 = new ChromeDriver(); // PARENT CALLING TO CHILD CLASS
        // IT IS POLMORFOSYM
        driver.get("www.google.com");

    }
}
