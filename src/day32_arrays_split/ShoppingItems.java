package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

          System.out.println("-------------Find the index of 'Gloves' in items array--------- ");

          //use for loop with condition
        for(int i=0; i< items.length;i++){
            if(items[i].equals("Gloves")) {
                System.out.println("Gloves found at index "+i);
                break; // i just want to look one 1 GLOVES thats why we put the break// exit for loop
               // System.out.println(i + " - " + items[i]);
            }
        }

        System.out.println("------ Set boolean to true if first 'ipad' is found");
        boolean ipadExists = false;

      for(String item: items) {
          if(item.equalsIgnoreCase("ipad")) {
              ipadExists = true;
              break;
          }
      }
            System.out.println("ipadExists = " + ipadExists);
       if(ipadExists){
           System.out.println("We bought the iPad!");
       }else{
           System.out.println("We forgot the iPad!");
       }

        System.out.println("--------Print a report  of each shopping  item---");

       for(int i = 0; i < items.length; i++){
           System.out.println(items[i] + " - $"+prices[i]+" - #"+ itemIDs[i]);
       }

         for(int i = 0; i< items.length; i++){
             if(items[i].equalsIgnoreCase("jacket")){
                 System.out.println(items[i] + " - $"+prices[i]+ " - #"+ itemIDs[i]);
                 break;// stop searching if jacket is found
             }
         }


    }
}
