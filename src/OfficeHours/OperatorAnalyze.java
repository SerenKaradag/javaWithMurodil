package OfficeHours;

public class OperatorAnalyze {
    /*
       Analyze the following without intellij. Calculate the output step by step
        */
    public static void main(String[] args) {


        int a = 5; // a = 6
        int b = a++ + a-- + a * 2 + a + ++a;
        //      5   + 6  +  5 * 2 + 5 + 6
        //      5   + 6  +  10 + 5 + 6
        //      11  +  10 + 5 + 6
        //      21 + 5 + 6
        //      26 + 6
        //   b =  32
        System.out.println("a- " + a);
        System.out.println("b-  " + b);



    }
}