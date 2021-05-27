package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "coke";
        String snackItem = "chips";

        if (selection.equals("drink")){
            System.out.println("drink option is selected");
            if(drinkItem.equals("tea")){
                System.out.println("tea is selected");
            }else{
                System.out.println("coke is selected");
            }
        }else if (selection.equals("snack")){
            System.out.println("Snack is selected");
            if (snackItem.equals("chips")){
                System.out.println("chips is selected");
            }else{
                System.out.println("Candy is selected");
            }
        }else {
            System.out.println("Nothing");
        }
    }
}
