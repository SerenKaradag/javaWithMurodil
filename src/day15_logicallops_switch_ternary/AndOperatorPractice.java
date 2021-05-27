package day15_logicallops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";


        if(onSale && freeShipping){
            System.out.println("Adding to cart - " + itemName);
        }else{
            System.out.println("continue shopping for good deals on -" + itemName);
        }

        if(freeShipping && onSale && itemName.equals("Wooden Spoon")) {
            System.out.println("Adding to cart -" + itemName);
        }else{
            System.out.println("continue shopping for good deals on " + itemName );
        }


    }
}
