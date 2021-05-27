package day43_list_custom_clases;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {

    public static void main(String[] args) {

        //1 nanosecond = 1_000_000_000 nanosecond
       // System.out.println(System.nanoTime());
        long start = System.nanoTime();
        List<Integer> mlnNums =  getIntegerList();
        long end= System.nanoTime();
        System.out.println("ArrayList time = " + (end - start));




       // System.out.println(mlnNums);

        long st = System.nanoTime();
         int[] arr =  getIntegerArray();
         long en = System.nanoTime();
        System.out.println("Array time = " + (en - st));


    }

    public static List<Integer> getIntegerList() {

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000_000 ; i++) {
            nums.add(i);
        }
       return  nums;
    }


    public static int[] getIntegerArray() {

       int[] nums1 = new int[1000_001];
        for (int i = 0; i <= 1000_000 ; i++) {
            nums1[i] = i;
        }
        return  nums1;
    }

    }

