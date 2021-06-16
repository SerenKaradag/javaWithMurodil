package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
       // TestData.ADMIN_USERNAME = "change"; ERROR CAN NOT CHANGE VALUE OF FINAL VARIABLE
        final int SSN = 432123433;
      //  SSN = 1234561; ERROR;  CAN NOT CHANGE

    }
}
