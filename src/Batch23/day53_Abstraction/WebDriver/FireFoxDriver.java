package Batch23.day53_Abstraction.WebDriver;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FireFoxDriver - navigating to : " + url);
    }

    @Override
    public void findElement(String locator) {

    }

    @Override
    public void getTitle() {
        System.out.println("FireFoxDriver- getting the title");
    }

    @Override
    public void quit() {
        System.out.println("FireFoxDriver - quit");
    }
}
