package day49_static;

public class StaticMethods {

    int num = 10; // doesnt static
    static int count = 5;

    public static void displayedMessage(String message){ // this is static

        System.out.println("mesaage " + message);
        //System.out.println("num " + num);  // does not working because nums not static. INSTANCE VARIABLE
        System.out.println("Count has static " + count); // STATIC

    }

    public static void anotherStaticMethod(){

        System.out.println("another static method");
        displayedMessage("wooden spoon");
    }

    public void instanceMethod(){
        System.out.println("Instance Method");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        System.out.println("hello from instance");
    }
}
