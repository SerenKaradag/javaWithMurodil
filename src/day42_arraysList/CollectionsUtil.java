package day42_arraysList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println(letters);

        System.out.println("reversed = " + letters);

        System.out.println( Collections.frequency(letters, 'a')  );


        int vCount = Collections.frequency(letters, 'v');
        System.out.println(vCount);

        System.out.println("MAX CHAR FOR ASCI TABLE ");
        System.out.println(Collections.max(letters));
        System.out.println("MIN CHAR FOR ASCI TABLE");
        System.out.println(Collections.min(letters));



        Collections.replaceAll(letters, 'a', 'o');  //return to boolean
        System.out.println("Every a replace to u");
        System.out.println(letters);

        List<Integer> nums = Arrays.asList(23, 1, 5, 6, 89, 58, 6, 75, 6, 63, 6);

        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println(nums);
         int max = Collections.max(nums);
         int min = Collections.min(nums);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int countOf6s = Collections.frequency(nums, 6);
        System.out.println(countOf6s);

        Collections.replaceAll(nums, 6, 50);
        System.out.println("after replaceAll");
        System.out.println(nums);

        Collections.shuffle(nums);
        System.out.println("AFTER SHUFFLE NUMS");
        System.out.println(nums);




    }
}
