package Batch23.day58_Maps;

import java.util.*;

public class MapsClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();  // ORDER IS RANDOM
        hashMap.put(null, null);


        Map<String , Integer> linkedHasMap = new LinkedHashMap<>(); //KEEPS INSERTION ORDER
        linkedHasMap.put(null, null);

        Map<String , Integer> treeMap = new TreeMap<>(); // ASCENDING ORDER
      //  TreeMap.put(null,null); DOES NOT ACCEPT NULL NULL

        Map<String , Integer> hashTable = new Hashtable<>(); // RANDOM ORDER, ISSYNCHRONIZED
      //  Hashtable.put(null, null);  DOES NOT ACCEPT NULL NULL



    }
}
