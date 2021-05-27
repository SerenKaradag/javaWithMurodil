package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";

        String[] words = sentence.split(" ");
        String reversed = "";
        //print words array in reserve order
        for(int i = words.length - 1; i >= 0; i--){
           // System.out.println(words[i] + " ");
            reversed += words[i] + " ";
        }

        System.out.println("Sentence = "+ sentence);
        System.out.println("reversed = "+ reversed);
    }
}
