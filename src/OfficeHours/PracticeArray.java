package OfficeHours;
import java.util.*;
public class PracticeArray {
    public static void main(String[] args) {
        int[] num ={ 1,2,-3,4,-34,55,78,90,33,10};
      //  System.out.println(Arrays.toString(num));
      int[] evenNum = new int[10];
      int[] oddNum= new int[10];
      int even = 0;
      int odd = 0;

        for(int i=0; i<num.length; i++){
            if(num[i] % 2 == 0) {
                evenNum[even] = num[i];
                even++;

            } else
            {
                oddNum[odd] = num[i];
                odd++;
            }
        }

        System.out.println(Arrays.toString(evenNum));
        System.out.println(Arrays.toString(oddNum));

        /**for(int each : num){
            if(each % 2 == 0){
                evenNum[even] = each;
             System.out.println(each);

            }else if(each % 2 == 1){
             System.out.println(each);
            }
        }*/
    }
}
