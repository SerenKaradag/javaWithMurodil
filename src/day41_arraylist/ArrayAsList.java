package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArrayAsList {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = "  + nums);
      //  nums.add(100);        UnsupportedOperationException
        // nums.remove(0);      UnsupportedOperationException
      //  nums.clear();         UnsupportedOperationException

        List<Integer> numsList = new ArrayList<>(Arrays.asList(23,1, 35, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println(numsList);
       // numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println(numsList);

        //   List String drinksWithCaffeine ->
        //   coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha





        List<String> drinksWithCaffeine = new ArrayList<> (Arrays.asList("coffee", "tea", "monster",
                "redbull", "coke", "pepsi", "mdew", "kambucha", "celsius"));


        System.out.println(drinksWithCaffeine);

        int caffeineAmount = 0;
        for(String drink : drinksWithCaffeine){
            if(drink.equals("monster") || drink.equals("redbull") || drink.equals("celsius")){

                caffeineAmount = 150;
                System.out.println(drink +" " + caffeineAmount);
            }else if(drink.equals("coffee") || drink.equals("kambucha")){
                caffeineAmount = 112;
                System.out.println(drink +" " + caffeineAmount);

            }else if(drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew"));
            caffeineAmount = 35;
            System.out.println(drink +" " + caffeineAmount);
             }

             for(String each : drinksWithCaffeine){
                 switch (each){
                     case "monster":  case "redbull":  case "celsius":
                         caffeineAmount = 150;
                         System.out.println(each +" " + caffeineAmount);

                     case "coffee": case "cambucha":
                         caffeineAmount = 112;
                         System.out.println(each +" " + caffeineAmount);
                     case "tea": case "coke": case "pepsi": case "mdew":
                         caffeineAmount = 35;
                         System.out.println(each +" " + caffeineAmount);

                 }
             }


        /**
         *    // for each use same thing loop
         */



        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));


             drinksWithCaffeine.forEach(drink -> {
                 System.out.println("----------");
                 System.out.println("each = "+ drink);
                 System.out.println("------------");
             });

































    }
}
