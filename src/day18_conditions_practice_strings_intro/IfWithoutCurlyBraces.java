package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "java";


        if(todayClass.equals("java"))
            System.out.println("Java is fun");
        else
            System.out.println("It is not java. it is "+ todayClass);



        int score = 5;
        if(score == 1)
            System.out.println("lowest score 1");
        else if(score == 2)
            System.out.println("score is 2");
        else if(score == 3)
            System.out.println("score == 3");
        else
            System.out.println("invalid score");


        // ERROR BLOW:

       // int score1 = 5;
        //if(score == 1)
        //    System.out.println("lowest score 1");
        //    System.out.println("lowest score 1");
        // else
        //   System.out.println("invalid score");
        //    System.out.println("invalid score");




    }
}
