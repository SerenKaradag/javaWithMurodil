package day42_arraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
      List<String> words = new ArrayList<>();
      words.add("java"); words.add("html"); words.add("selenium");
      words.add("input"); words.add("a"); words.add("title");
      // pass the words list to printStrList method
        printStrList(words);
        // we add manual every eadch value
        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));

        List<Integer> nums =  Arrays.asList(23, 54, 23, 545, 234, 11);
        // we need primitive type datatype for print
       int sum =  sumIntegerList(nums);
        System.out.println(sum);
    }

    public static void printStrList (List<String> stringList){

     for(String str : stringList){

         System.out.print(str + " ");
     }
        System.out.println();

    }

    public static int sumIntegerList (List<Integer> integerList) {
        int sum =0;
        for(int nums : integerList){
            sum += nums;

        }

        return sum;

    }

}


