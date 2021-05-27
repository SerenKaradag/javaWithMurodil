package day37_method_overloading;

public class MethodPractice {

    public static void main(String[] args) {
        System.out.println(repeatString("I can do it!", 10, '-'));
    }

    public static String repeatString(String word, int times, char delimeter){
        String retValue = "";

        for(int i =1; i <= times; i++){
            //take care of last delimeter:
            if(i == times){
                retValue += word;
            }else{
                retValue += word +delimeter;
            }


        }

        return retValue;
    }
}
