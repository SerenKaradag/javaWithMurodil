package Batch23.day53_Abstraction.WebDriver;

public class ChromeDriver implements WebDriver{

    @Override
    public void get(String url) {
        System.out.println("Chrome Driver -navigating to: " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating the ements by  " + locator);
    }

    @Override
    public void getTitle() {
        System.out.println("ChromeDriver - getting the title");
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver - quit");
    }
}
