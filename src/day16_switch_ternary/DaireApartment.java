package day16_switch_ternary;

public class DaireApartment {
    public static void main(String[] args) {
        int numberOfBedrooms = 2;
        double startingPRice = 0.0;
        switch(numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPRice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPRice = 1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPRice = 2889;
                break;

                //return exit to debug
            default:
                System.out.println("Sorry we are currently out of"+ numberOfBedrooms +"bedroom apt");
        }
    }
}
