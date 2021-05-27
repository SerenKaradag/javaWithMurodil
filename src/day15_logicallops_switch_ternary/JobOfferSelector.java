package day15_logicallops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Texas";
        double salary = 120.000;
        boolean isremote = true;
        boolean benefits = true;

        if(location.equals ("Texas") &&  salary>=120.000  &&  isremote &&benefits ){
            System.out.println("Sure, I will accept this offer");
        }else{
            System.out.println("Lets consider another offer or negotiate");
        }
    }
}
