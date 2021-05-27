package day38_methods;

public class MethodCallMethods {
    public static void main(String[] args) {
        start();
        contiunues();
        end();
    }


    public static void start() {
        System.out.println("start");
        contiunues();
    }
    public static void contiunues(){
        System.out.println("continue");
        end();
    }
    public static void end() {
        System.out.println("end");
    }


}
