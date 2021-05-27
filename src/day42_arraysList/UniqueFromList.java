package day42_arraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<> (Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        System.out.println(nums);
        // we are create a new list and then we can store all unique numbers.
        List<Integer> uniqueList = getUniqueIntegers(nums);

        System.out.println("\n uniqueList = " + uniqueList);




    }

    public static List<Integer> getUniqueIntegers(List<Integer> nums) {
        List<Integer> uniqueList = new ArrayList<>();


        for(int each : nums){
           // System.out.print(each + " ");
            if(Collections.frequency(nums, each) == 1){
                System.out.print(each + " ");
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
