package Study;
import java.util.ArrayList;
import java.util.*;
import java.util.*;

class Main{

    //create your method below

    public static ArrayList<Integer>combineAL(ArrayList<Integer>numbersOne,
                                              ArrayList<Integer>numbersTwo){

        ArrayList<Integer>allNum = new ArrayList<>();
        for(Integer all1 : numbersTwo){
            allNum.add(all1);
        }
        for(Integer all : numbersOne) {

            allNum.add(all);

        }
        return allNum;
    }
    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAL(list, list2));

    }

}