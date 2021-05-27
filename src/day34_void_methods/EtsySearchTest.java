package day34_void_methods;

public class EtsySearchTest {

    public static void main(String[] args) {
        System.out.println("---Starting ETSY Search Smoke Test---");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultAreDisplayed();
        System.out.println("--ETSY Search Smoke test completed  - Pass -");
    }


    public static void openBrowser() {
        System.out.println("Launching Chrome browser");

    }

    public static void navigateToEtsyUrl()  {
        System.out.println("Navigate to https://www.etsy.com/ ");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("PASS:Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden Spoon' in search field and click search");
    }

    public static void verifyResultAreDisplayed(){
        System.out.println("PASS: Search results are ");
    }
}
