package Study;
import  java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String reserve = "";
        Scanner scan= new Scanner(System.in);
        String word =scan.nextLine();



        for(int i = word.length()-1;i >=0 ; i--){

        reserve =reserve +  word.charAt(i);


        }
        if(word.equals(reserve)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
