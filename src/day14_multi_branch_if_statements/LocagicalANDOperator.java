package day14_multi_branch_if_statements;

public class LocagicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false&& true);
        System.out.println(false&& false);

        System.out.println(10 > 5 && 1==1 );
        System.out.println(15 > 6 && 75 > 85 );
        System.out.println(3 - 2 == 1 && 5>2);
        
        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println("check = " + check);

    }
}
