package Batch23;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist23 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4));


        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
           if(list.get(i)% 2 != 0){
               list.remove(i);
           }
        }

        System.out.println("-----------------------------------------");



        ArrayList<Integer> list2 = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4));

     //   list2.removeIf(each -> each<5 );
        list2.removeIf(each ->  each %2 !=0);

        System.out.println(list2);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmet" , "Merve", "Seren", "Sait", "Fhilip"));

        names.removeIf(p  -> p.contains("a") );

        System.out.println(names);

    }
}