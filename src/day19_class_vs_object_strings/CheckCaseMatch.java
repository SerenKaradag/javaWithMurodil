package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "USA";


        if(countryCode.equals(countryCode.toUpperCase() )){
            System.out.println("Pass - case is correct");
        }else{
            System.out.println("Fail - case is incorrect");
        }

        // if  value(usa) is lower case is INCORRECT,
        // if value(USA) is upper case it gonna be correct first one

        String word = "selenium";
        System.out.println(word.startsWith("s")); //true
        System.out.println(word.startsWith("selen"));

        word = "java";
        System.out.println(word.startsWith("j")); //true
        System.out.println(word.startsWith("ja"));

        String word1 = "selenium";
        System.out.println(word1.endsWith("m"));
        System.out.println(word1.endsWith("lenium"));
    }
}
