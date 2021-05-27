package day44_custom_clases;

public class MyApp {
    public static void main(String[] args) {

        App uberApp = new App(); // crreating new object

        //We already assign other java class
        // information is coming from app class



        uberApp.name = "Uber";
        uberApp.version = 9.5;
        uberApp.open(); // call open method using variable
    }
}
