package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Washington Dc");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");

        cities.add(0, "Ashgabat"); // index 0 add an other city
        // print all values in same line
        System.out.println(cities);

        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        System.out.println("last city = " + cities.get(cities.size()-1)); // Dynamic


        int size = cities.size();
        System.out.println("there are " +  size + "cities in the list");


        for(int i = 0; i < cities.size(); i++){

            System.out.print(cities.get(i) + " ");
        }
        System.out.println();

        for(String city : cities){
            System.out.println(city + " ");
        }

        //delete item from arraylist
        // remove using index. delete value at index 3
        cities.remove(3);
        // remove using object/value
        cities.remove("New york");

        System.out.println("after remove = " + cities);

        //delete / remove all values from list
        cities.clear();

        //1) print it out // print =spit
        System.out.println("cities = " + cities);

        //2 ) using isEmpty
        if(cities.isEmpty())  {

            System.out.println("List is empty");
        }













    }
}
