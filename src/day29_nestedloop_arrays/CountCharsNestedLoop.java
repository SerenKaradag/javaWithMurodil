package day29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {


        String word = "java";


        for (int outher = 0; outher < word.length(); outher++){
            System.out.println ("outher:  " + "" + word.charAt(outher));
            int count = 0;
            for(int inner = 0; inner < word.length(); inner++){

               // System.out.println ("inner:  " + "" + word.charAt(inner));

                if(word.charAt(outher) == word.charAt(inner)){
                    count++;
                }
            }
            System.out.println(word.charAt(outher) + "="+ count);
        }
    }
}
