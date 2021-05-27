package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        double price = 0;
        double calories = 0.0;
        String size = "tall";

       // if(size.equals("tall")){

       // }
        switch(size) {
            case "tall":
                System.out.println("Tall cappuccino please");

                price = 8.65;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande cappucino please");
                price = 6.5;
                calories = 75;
                break;
            case "yenti":
                System.out.println("Venti cappucino please");
                price = 9.5;
                calories = 96;
                break;
            default:
                System.out.println("We don`t serve that" + size + " Cappucino");
                break; //OPTIONAL

        }

        System.out.println("Total price: $" + price);
        System.out.println("You will consume "+ calories +" cals of energy");


        }

    }

