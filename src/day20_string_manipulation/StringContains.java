package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); // true
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));//true

        //if company contains space, print "multiple words company name"
        //else "single word company name

        if(company.contains(" ")){
            System.out.println("multiple word company name");
        }else {
            System.out.println("single word company name");
        }
    }
}
