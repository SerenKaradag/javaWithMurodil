package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        System.out.println(word.toUpperCase());
        System.out.println("JAVA".toLowerCase()); // SAME THING




        System.out.println(word.toLowerCase());
        System.out.println("java".toUpperCase()); // SAME THING
        
        
        
        word.toLowerCase(); // Does not change any value printing same value WE DID NOT ASSIGN TO VALUE
        System.out.println("word = " + word);
        
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase); //change the value bec we assign to value again

        word = word.toLowerCase();
        System.out.println("word = " + word); // change the value bec we assign to value again


        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);


    }
}
