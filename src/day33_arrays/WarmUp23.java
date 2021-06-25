package day33_arrays;

import java.util.Arrays;

public class WarmUp23 {


    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500,600};
        System.out.println(Arrays.toString(numbers));
        remove(numbers, 3); //{100,200,300,500,600} there is no 400

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------");

        double[] array1 = {6.5, 7.5, 8.5, 9.5}; // index2
        System.out.println(Arrays.toString(array1));

       array1 = remove(array1, 2);

        System.out.println(Arrays.toString(array1));
    }


    public static int[] remove(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index");
            System.exit(0); // exist the system

        }


        int[] result = new int[array.length-1];

        for(int i = 0, j = 0 ; i < array.length; i++){
            if(i == index){
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }




    public static double[] remove(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.out.println("Invalid Index");
            System.exit(0); // exist the system

        }


        double[] result = new double[array.length-1];

        for(int i = 0, j = 0 ; i < array.length; i++){
            if(i == index){
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }











}
