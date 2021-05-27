package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount =2500.55;
        if (salesAmount <= 1000) {
            System.out.println("Good job, you are qualified for bonus");
            bonus = 50.0;
        } else {
            System.out.println("Great job, you are qualified for bonus");
            bonus = 100.0;
        }
        System.out.println("Your total bonus: $" + bonus);
    }
}
