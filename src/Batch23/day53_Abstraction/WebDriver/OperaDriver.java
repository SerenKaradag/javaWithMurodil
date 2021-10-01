package Batch23.day53_Abstraction.WebDriver;

public class OperaDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("OperaDriver - navigating to : " + url);
    }

    @Override
    public void findElement(String locator) {

    }

    @Override
    public void getTitle() {
        System.out.println("OperaDriver - getting the title");
    }

    @Override
    public void quit() {
        System.out.println("OperaDriver  - quit");
    }
}
