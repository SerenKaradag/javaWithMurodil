package Practice;

public class CountJava {
    public static void main(String[] args) {


        String str = "java is fun.java class today, not javascript";

        int count = 0;
        while (str.contains("java")) {
            str = str.replaceFirst("java" , "");
            count++;

        }
        System.out.println("java was found "+count);
    }
}
