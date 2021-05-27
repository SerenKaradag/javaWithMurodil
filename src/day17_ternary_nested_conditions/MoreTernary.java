package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {

        int hourlyRate = 50;
        String reply = (hourlyRate > 45)? "accept" : "reject" ;
        System.out.println("reply = " + reply);


        String todayClass = "java";
        String teacher =( todayClass.equals("java")) ? "Murodil & Saim" : "Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "yes" : "no";
        System.out.println("driving = " + driving);

    }
}
