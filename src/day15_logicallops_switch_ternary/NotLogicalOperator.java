package day15_logicallops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {

        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));


        int age = 9;

        if (!(age > 7)) {

            System.out.println(" Need to sit in child car seat.Age = " + age);
        }else{
            System.out.println("Can sit normal seat. age = " + age);
        }

        boolean isSmokingAllowed = false;
        if(!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit");
        }

        boolean isAffordable = true;

        if (!isAffordable) {
            System.out.println(!isAffordable);
        }

        String env = "qa";
        if(!env.equals("qa")){
            System.out.println("in wrong enviroment for QA testing");
        }

        String carModel = "Tesla;";
        if(!carModel.equals("Tesla")){
            System.out.println("I am interesting");
        }

        //*******************************************************

        String secretPassword = "abc123";
        String inputPassword = "abc321";
         if(!inputPassword.equals("abc123")){
             System.out.println("Incorrect Password");
         }

                                      //SAME CHECKING

         if(!inputPassword.equals(secretPassword)){
             System.out.println("Correct password");
         }else{
             System.out.println("In correct password");













        }
    }
}
