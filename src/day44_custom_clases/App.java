package day44_custom_clases;

public class App {
        String name ; // null default //DATA
        Double version; // 0.0 by default // DATA


    public void open(){
        System.out.println("Opening = "+ name);
        System.out.println("Version = "+ version);
    }

    public static void main(String[] args) {
        App app1 = new App();
        app1.open();
    }
}
