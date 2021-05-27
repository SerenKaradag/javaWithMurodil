package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {

        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0 , "jeep");
        myCars.add(1, "lada");
        myCars.add(2 , "yugo");

        // jeep lada yugo toyota mazda ford

        System.out.println(myCars.toString());// we dont need to use toString UNSECCERRAY

        String allCarsIn1St = myCars.toString();

        System.out.println("allCarIn1st = " + allCarsIn1St);

        //CHANGE INDEX 0 TO LAMBORGHINI
        myCars.set(0, "lamborghini");

        System.out.println("after set = " + myCars.toString());

        // add one more value
        // set just index 1 replace

        myCars.set(4, "Honda");

        System.out.println("After set honda = " + myCars.toString());

        /**
         *How would you do that if myCars was Array:
         * myCars[4] = "Honda"
         */

        //find the index of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("index of moskivich = " + moskvichIndex);

        myCars.set(moskvichIndex, "jiquli");
        System.out.println("after set to jiguli = " + myCars);

        //myCars.set(5 , "trabant");
        myCars.set(myCars.indexOf("ford") , "trabant");
        System.out.println(myCars);

        if(myCars.contains("lada")){

            myCars.set(myCars.indexOf("lada") , "bugatti" );
            System.out.println(myCars);
        }else {
            System.out.println("lada is not found");
        }

        for(int i =0; i < myCars.size(); i++){
            if(myCars.get(i).equals("lamborghini")){
                //change to prius
                myCars.set(i , "prius");
            }else if(myCars.get(i).equals("lada")){
                myCars.set(i , "lexus");
            }else if(myCars.get(i).equals("trabant")){
                myCars.set(i , " audi");
            }
        }
    }
}
