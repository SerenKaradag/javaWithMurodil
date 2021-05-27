package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;


        if(isHungry){
            System.out.println("I am hungry I will go get something to eat");
        }else{
            System.out.println("I am not hungry, Lets keep coding java");
        }

        double price = 130.44;
        boolean isAffordable = 200.0 <= price;
        System.out.println("isAffordable = " + isAffordable);

        if(isAffordable) {
            System.out.println("I can afford it, lets buy!");

        }else{
            System.out.println("Too expensive, lets keep coding java");
        }

        boolean isRemoteJob = false;

        if(isRemoteJob != true){
            System.out.println("Sorry, I am not interested");
        }else{
            System.out.println("Sure, I am interested, what is interview progress");
        }
    }
}
