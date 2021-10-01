package Batch23.day53_Abstraction.WebDriver;

public class EdgeDriver implements  WebDriver{
    @Override
    public void get(String url) {
        System.out.println("EdgeDriver - navigating to : " + url);
    }

    @Override
    public void findElement(String locator) {

    }

    @Override
    public void getTitle() {
        System.out.println(" EdgeDriver- getting the title");
    }

    @Override
    public void quit() {
        System.out.println("EdgeDriver- quit");
    }
}
