package Batch23.day53_Abstraction.WebDriver;

public interface WebDriver {


    void get(String url);
    void findElement(String locator);
    void getTitle();
    void quit();

   /* public static void main(String[] args) {

    }

    default void method(){

    }

    */



}
