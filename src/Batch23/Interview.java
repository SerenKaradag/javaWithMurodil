package Batch23;

public class Interview {
    public static void main(String[] args) {

        int [] nums = {8, 9,5,3};
        int arr = 0;
        for(int each : nums){

            if(each > arr){
                arr = each;

            }


        }
        System.out.println(arr);
    }
}
