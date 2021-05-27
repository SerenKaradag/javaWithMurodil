package day38_methods;
import java.util.*;
//import static day38_methods.StringUtils.*;

//IMPORT ALL STATIC METHODS. SO THAT YOU CAN JUST CALL BY METHOD NAME, WITHOUT CLASSNAME
//line17 we dont call class name  bec of import static day38_methods.StringUtils.*

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username can not be null or empty");
        }

        System.out.println("isPalindrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
      //  System.out.println("isPalindrome(CYBERTEK) = " +isPalindrome("CYBERTEK")); // we can use that way but it needed
                                                                             // import static day38_methods.StringUtils.*;

       // System.out.println("return REVWORD =  "  + StringUtils.reverse("java"));  //avaj

        Scanner scan = new Scanner(System.in);

        String word =scan.next();
        System.out.println("Word is  =  "+ word);
        System.out.println("Revword is = " + StringUtils.reverse(word));






    }
}
