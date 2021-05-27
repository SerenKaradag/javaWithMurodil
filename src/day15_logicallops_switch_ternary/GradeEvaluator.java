package day15_logicallops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {

        char grade = 'A';

        if(grade == 'A' || grade == 'B' || grade=='C'){
            System.out.println("Passed. with Grade - " + grade);
        }else if(grade == 'D'){
            System.out.println("qualify for retake. Grade - " + grade);
        }else if(grade == 'E'){
            System.out.println("fail. Grade - " + grade);
        }else {
            System.out.println("invalid Grade - " + grade);
        }










    }
}
