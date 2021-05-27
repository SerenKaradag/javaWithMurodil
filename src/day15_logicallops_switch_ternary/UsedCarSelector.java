package day15_logicallops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {


        double budget = 5000.0;
        String model = "Tesla";
        double carPrice = 4999.0;
                          //AND                       //OR                      //OR
        if(carPrice<= budget && model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla") ){
            System.out.println("Ready to purchase model = " + model + " price = " + carPrice);
        }else{
            System.out.println("Not interested in Moedel = " +  model + " price = " + carPrice);
        }


    }
}
