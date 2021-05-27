package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "MOM";
        char first = word.charAt(0);
        char third = word.charAt(2);

        if (first == third) {
            System.out.println("first and last letters match");
        } else {
            System.out.println("first and last letters mismatch");
        }

        String friend = "level";
        char firstLetter = friend.charAt(0);
        int count = friend.length();
        //count--;
        //char lastLetter = friend.charAt(count-1);
        char lastLetter = friend.charAt(friend.length() - 1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if (firstLetter == lastLetter) {
            System.out.println(friend + "- first and last match");
        } else {
            System.out.println(friend + "- first and last mismatch");
        }

        String word1 = "java";
        System.out.println(word.indexOf("j"));
    }
}
