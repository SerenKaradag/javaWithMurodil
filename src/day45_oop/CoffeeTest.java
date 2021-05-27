package day45_oop;

public class CoffeeTest {
    public static void main(String[] args){
        Coffee myCoffee = new Coffee();
        System.out.println("cofee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
       // NOTTTTT THAT WAY myCoffee.type = "Turkish Coffee";  instead using a method;
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
        //decribe myCoffee - show all variable values
        System.out.println(myCoffee.toString());

        //ADD ANOTHER COFFEE OBJECT, SET VALUES, CALL METHODS
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappiccuno");
        System.out.println("coffee1 type = " + coffee1.getType());


        Coffee coffee2 = coffee1;
        System.out.println("Coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frabbacino");
        //point to same object as coffee2
        coffee3 = coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());


        Coffee coffee4 = null; // YOUR LOCATER COULD NOT FOUND ANY HEAP.
        coffee4.setType("turkish"); //NULLPOINTEREXCEPTION









    }
}
