package day20_string_manipulation;
import java.lang.*;   /**import all classes from java.lang package*/
public class StringCreationMethods {
    public static void main(String[] args) {


        String word1 = "potato";
        String word2 = new String ("tomato");
        String word3 = "";
        String word4 = new String();


        String jobTitle = "";
        System.out.println(jobTitle.isEmpty()); //TRUE BOOLEAN = isEmpty
        System.out.println(jobTitle.length()); // length = int that is why 0
        System.out.println(jobTitle.length() == 0 );

        if(jobTitle.isEmpty()){
            System.out.println(" job title is missing, please resend");
        }else{
            System.out.println("job title looks good");
        }

        if(jobTitle.length() == 0){
            System.out.println("job title is empty");
        }else{
            System.out.println("job title is not empty");
        }

        System.out.println(jobTitle.equals(""));


        if("".equals(jobTitle)){
            System.out.println("job title is empty");
        }else{
            System.out.println("job title is not empty");
        }


        String word = " ";
        System.out.println(word.isEmpty()); // false bec space is character
        System.out.println(word.length()); // 1. blank space is a character


        String veggie = "carrots";
        System.out.println(veggie.isEmpty()); // false
        //if veggie IS NOT EMPTY, PRINT WE HAVE CARROTS

        if(!veggie.isEmpty()){
            System.out.println("we have "+ veggie);
        }





    }
}
