package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 75;
        String result;

        if(score > 60){
            result = "Pass";
        }else{
            result = "Fail";
        }
        System.out.println("result = " + result);

        //WITH TERNARY:
        int score1 = 88;
        String result1 = (score1 > 60) ? "Pass" : "Fail";

        System.out.println("result1 = " + result1);

        String quality = "good";
        System.out.println(quality.equals("good")? 100 : 0);
        int rating = quality.equals("good")? 100 : 0;
        System.out.println("rating = " + rating);

        int score3 = 100;
        char grade = (score3 > 90)? 'A' : 'B';

        int num1 = 40;
        int num2 = 30;
        int max = num1 > num2? num1 : num2;
        System.out.println("max = " + max);




        // if(score > 90){
       //     grade = 'A';
       // }else{
       //     grade = 'B';
       // }
























    }
}
