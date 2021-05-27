package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word = "+ words[0]);
        System.out.println("2nd word = "+words[1]);
        System.out.println("3rd word = "+ words[2]);
      //  System.out.println("4th word = "+ words[3]);

        for(String each : words){
            System.out.println(each);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] split = googleResult.split("");
        System.out.println("Count = "+split[1]);
        System.out.println("Count = "+split[3]);
        System.out.println("Seconds = "+ split[3].replace("(", ""));
        System.out.println();

    }
}
