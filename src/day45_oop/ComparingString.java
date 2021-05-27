package day45_oop;

public class ComparingString {
    public static void main(String[] args) {


        String word1 = "java"; //creating in string pool
        String word2 = "java"; //re-use from string pool
        String word3 = new String("java"); // create in HEAP outside String poll bec OF NEW
        String word4 = new String("java");  // create in HEAP outside String poll bec OF NEW

        System.out.println(word1 == word2); //TRUE
        System.out.println(word1 == word3); //FALSE
        System.out.println(word3 == word4); // FALSE -> point to different objects in heap

        System.out.println(word1.equals(word2));
        System.out.println(word1.equals(word3));
        System.out.println(word3.equals(word4));
    }
}
