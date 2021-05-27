package Practice.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {

    public static void main(String[] args) {

        String[] password = {"one", "apple", "hold"};

        ArrayList<String> hiddenPassword = new ArrayList<>();

        for(String each : password){
            hiddenPassword.add(convertToStarts(each));
        }
        System.out.println("Original: " + Arrays.toString(password));
        System.out.println(hiddenPassword);
    }

    public static String convertToStarts (String str){

      String starts = "";
      for(int i =0; i < str.length(); i++){
          starts += "*";
      }
      return starts;
    }
}
