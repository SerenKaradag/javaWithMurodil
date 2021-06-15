package day53_inheritance.hiding;

public class Phone {
    String type = "Old School phone";

    public static void use(){
        System.out.println("Using Mobile Phone");
    }

    public void call(){
        use();
        System.out.println("and sending a text message");
    }
}
