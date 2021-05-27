package day40_arraylist;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();  //DEFAULT_CAPACITY = 10. DECLARING WITH 10 NULL.
        List list2 = new ArrayList();


        //ADD VALUES
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);
    }
}
